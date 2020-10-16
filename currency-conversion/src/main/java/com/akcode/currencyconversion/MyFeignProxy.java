package com.akcode.currencyconversion;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.akcode.currencyconversion.model.CurrConv;

//@FeignClient(name="currency-conversion",url="localhost:8889")
@FeignClient(name="currency-exchange-services")
@RibbonClient(name="currency-exchange-services")
public interface MyFeignProxy {
	
	@GetMapping("curr-ex2/from/{from}/to/{to}")
	public CurrConv getDataProxy(@PathVariable String from, 
			@PathVariable String to);
}
