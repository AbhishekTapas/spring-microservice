package com.akcode.currencyconversion.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.akcode.currencyconversion.MyFeignProxy;
import com.akcode.currencyconversion.model.CurrConv;

@RestController
public class HomeController {
	
	@Autowired
	private MyFeignProxy myProxy;

	@GetMapping("/curr-cov/from/{from}/to/{to}/qua/{qua}")
	public CurrConv getData(@PathVariable String from, 
							@PathVariable String to, 
							@PathVariable int qua) {
		
		System.out.println("Hitting the URI");
		
		//PROBLEM ...
		Map<String, String> toFromMap = new HashMap<>();
		toFromMap.put("from", from);
		toFromMap.put("to", to);
		
		ResponseEntity<CurrConv> forEntity = new RestTemplate().getForEntity("http://localhost:8889/curr-ex2/from/{from}/to/{to}", 
						CurrConv.class,
						toFromMap);
		
		CurrConv body = forEntity.getBody();
		System.out.println("$$$" + body.getExValue());
		return new CurrConv(body.getId(),from,to,body.getExValue(),qua*body.getExValue(),body.getPort());
	}
	
	@GetMapping("/curr-cov2/from/{from}/to/{to}/qua/{qua}")
	public CurrConv getData2(@PathVariable String from, 
							@PathVariable String to, 
							@PathVariable int qua) {
		
		System.out.println("Hitting the URI 2");
		
		CurrConv currConv = myProxy.getDataProxy(from, to);
		currConv.setrData(qua*currConv.getExValue());
		
		return currConv;
	}
}
