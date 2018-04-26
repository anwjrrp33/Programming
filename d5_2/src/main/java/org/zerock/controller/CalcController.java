package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/calc/*")
@Log4j
public class CalcController {
	
	@GetMapping("/multi")
	public void multi(double a, double b) {
		log.info("a: " + a);
		log.info("b: " + b);
	}
	
	@GetMapping("/add")
	public String add() {
		log.info("calc add");
		return "redirect:/calc/result";
	}
	
	@GetMapping("/result")
	public void result() {
		log.info("result");
	}
}
