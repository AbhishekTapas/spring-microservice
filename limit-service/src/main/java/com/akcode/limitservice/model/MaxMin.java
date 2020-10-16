package com.akcode.limitservice.model;

public class MaxMin {
	private int max;
	private int min;
	
	public MaxMin() {
		
	}
	
	public MaxMin(int max, int min) {
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
