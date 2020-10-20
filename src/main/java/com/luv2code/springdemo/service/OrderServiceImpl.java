package com.luv2code.springdemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.springframework.stereotype.Service;

import com.luv2code.springdemo.entity.RequestPojo;
import com.luv2code.springdemo.entity.ResponsePojo;

@Service
public class OrderServiceImpl implements OrderService {


	@Override
	public ResponsePojo checkPatternMatch(RequestPojo request) {		
		
		ResponsePojo response = new ResponsePojo();

		boolean isValidRegEx = true;
		try {
			new String().matches(request.getRegex());
		} catch (PatternSyntaxException e) {
			isValidRegEx = false;
		}
		if (isValidRegEx == true) {

			System.out.print("Valid regex");

			List<String> items = Arrays.asList(request.getTextBody().split(" "));
			List<String> match = new ArrayList<>();
			for (String s : items) {

				if (Pattern.matches(request.getRegex(), s)) {
					System.out.println("sdsdddddddddd");
					match.add(s);
				}
			}

			if (match.size() > 0) {
				response.setMatch(match.toString());

			}

			response.setError("false");
			return response;

		}

		response.setError("true");

		return response;

	}

}
