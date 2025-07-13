package com.cognizant.spring_learn.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private String code;
	private String name;

	private Logger Log = LoggerFactory.getLogger(Country.class);

	public Country() {
		Log.info("Inside Country Constructor");
	}

	public String getCode() {
		Log.info("Inside getCode()");
		return code;
	}

	public void setCode(String code) {
		Log.info("Inside setCode() - setting code to: {}", code);
		this.code = code;
	}

	public String getName() {
		Log.info("Inside getName()");
		return name;
	}

	public void setName(String name) {
		Log.info("Inside setName() - setting name to: {}", name);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
}