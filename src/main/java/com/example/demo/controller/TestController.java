package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/a")
	public String asd() {
		return "成功";
	}
	
	@GetMapping("/b")
	public String assssd() {
		return "saldmklasmd;klma;slmd;lamsdklmaskmdklmnaskodmklasnlkdaslmkl";
	}
	
}
