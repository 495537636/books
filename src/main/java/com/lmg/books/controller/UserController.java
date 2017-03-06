package com.lmg.books.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/checkPhoneNumIsRegist")
	public String checkPhoneNumIsRegist(HttpServletRequest request, HttpServletResponse response){
		String phonenum = request.getParameter("phonenum");
		System.out.println("******************" + phonenum);
		return null;
	}

}
