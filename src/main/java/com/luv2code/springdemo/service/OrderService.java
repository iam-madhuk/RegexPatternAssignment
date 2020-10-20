package com.luv2code.springdemo.service;

import com.luv2code.springdemo.entity.RequestPojo;
import com.luv2code.springdemo.entity.ResponsePojo;

public interface OrderService {

	public ResponsePojo checkPatternMatch(RequestPojo request);

}
