package com.cognizant.account.controller;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController 
@RequestMapping("/accounts")
class Accountcontroller {
	@GetMapping("/{number}")
	public ResponseEntity<Map<String, Object>> getAccount(@PathVariable String number) {
	    Map<String,Object>response=Map.of(
	        "number",number,
	        "type","savings",
	        "balance",234343
	    );
	    return ResponseEntity.ok(response); 
}
}
