package com.luv2code.springdemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.RequestPojo;
import com.luv2code.springdemo.entity.ResponsePojo;
import com.luv2code.springdemo.service.OrderService;

@RestController
public class RegexController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/match")
	ResponsePojo checkStringMatch(@RequestBody RequestPojo request) {
		return orderService.checkPatternMatch(request);
	}
}
