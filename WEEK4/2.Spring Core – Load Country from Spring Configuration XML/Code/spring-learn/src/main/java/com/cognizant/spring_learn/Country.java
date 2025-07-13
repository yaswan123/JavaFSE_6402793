package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private String code;
    private String name;

    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    public Country() {
        LOGGER.info("Inside Country Constructor.");
    }

    public String getCode() {
        LOGGER.info("getCode() method");
        return code;
    }

    public void setCode(String code) {
        LOGGER.info("setCode() method");
        this.code = code;
    }

    public String getName() {
        LOGGER.info("getName() method");
        return name;
    }

    public void setName(String name) {
        LOGGER.info("setName() method");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}