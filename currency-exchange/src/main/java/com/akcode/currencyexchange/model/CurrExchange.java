package com.akcode.currencyexchange.model;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CurrExchange {
	
	@Id
	private int id;
	private String from;
	private String to;
	private int exValue;
	private int port;
	
	public CurrExchange() {
		
	}
	
	public CurrExchange(int id, String from, String to, int exValue) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.exValue = exValue;
	}
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExValue() {
		return exValue;
	}

	public void setExValue(int exValue) {
		this.exValue = exValue;
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
	
}
