package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.service.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalcController {
	@Autowired
	private CalcService service;
	// ADDITION - RequestParam
	// URL: http://localhost:8080/calc
	@RequestMapping("/add")
	public int add(@RequestParam int a, @RequestParam int b) {
		return service.add(a,  b);
		
	}
	@RequestMapping("/subtract/{a}/{b}")
	public int subtract(@PathVariable int a, @PathVariable int b) {
		return service.subtract(a,  b);
	}
	@RequestMapping("/multiply/{a}/{b}")
	public int multiply(@PathVariable int a, @PathVariable int b) {
		return service.multiply(a,  b);
	}
	@RequestMapping("/divide")
	public double divide(@RequestParam int a, @RequestParam int b) {
		return service.divide(a,  b);
	}
	@RequestMapping("/modulo/{a}/{b}")
	public int modulo(@PathVariable int a, @PathVariable int b) {
		return service.modulo(a, b);
	}

}
