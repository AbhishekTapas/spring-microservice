package com.akcode.limitservice.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("limit-service")
public class MaxMinConf {
	private int max;
	private int min;
	
	public MaxMinConf() {
		
	}
	public MaxMinConf(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
}
