package com.akcode.currencyconversion.model;

public class CurrConv {
	
	private int id;
	private String from;
	private String to;
	private int exValue;
	private int rData;
	private int port;
	
	
	public CurrConv() {
		
	}
	
	public CurrConv(int id, String from, String to, int exValue, int rData, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exValue = exValue;
		this.rData = rData;
		this.port = port;
	}
	
	
	
	@Override
	public String toString() {
		return "CurrConv [id=" + id + ", from=" + from + ", to=" + to + ", factor=" + exValue + ", rData=" + rData
				+ ", port=" + port + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getExValue() {
		return exValue;
	}
	public void setExValue(int exValue) {
		this.exValue = exValue;
	}
	public int getrData() {
		return rData;
	}
	public void setrData(int rData) {
		this.rData = rData;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
}
