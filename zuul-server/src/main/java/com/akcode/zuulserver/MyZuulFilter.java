package com.akcode.zuulserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class MyZuulFilter extends ZuulFilter {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		//should the filter be executed or not ....
		System.out.println("Abhishek is in shouldFilter()");
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		logger.info("Abhishek {},{}",request,request.getRequestURI());
		System.out.println("Abhishek is in Run()");
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		System.out.println("Abhishek is in filterType()");
		return "pre";
	}

	
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		System.out.println("Abhishek is in filterOrder()");
		return 1;
	}

}
