package com.cognizant.Loan.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/loans")
public class Loancontroller {
	@GetMapping("/{number}")
	public ResponseEntity<Map<String, Object>> getloan(@PathVariable String number)
	{
		Map<String,Object>response=Map.of(
				"number",number,
				"type","car",
				"loan",400000,
				"emi",3258,
				"tenure",18);
		return ResponseEntity.ok(response);
	}
}
