package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientRibbonController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/consumer")
	public String all() {
		// 发起REST请求
		return restTemplate.getForObject("http://eurekaClient/all", String.class);
	}
	
}
