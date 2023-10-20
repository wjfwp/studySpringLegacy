package com.simple.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;

@Controller
@RequestMapping("/request")
public class RequestController {
	
	@RequestMapping("/req_ex01")
	public String ex01() {
		return "request/req_ex01";
	}
	
	@RequestMapping(value = "/basic1", method = RequestMethod.GET)
	public void basic1() {
		System.out.println("basic1");
	}
	
	@RequestMapping(value = "/basic2", method = RequestMethod.POST)
	public void basic2() {
		System.out.println("222");
	}
	
	@RequestMapping("/basic3")
	public void basic3() {
		System.out.println("333");
	}
	
	@RequestMapping("/req_ex02")
	public String ex02() {
		return "request/req_ex02";
	}
	
	//전통적인 방법
//	@RequestMapping("/param")
//	public String param1(HttpServletRequest request ) {
//		
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");
//		String[] inter = request.getParameterValues("inter");
//		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(inter);
//		
//		return "request/result";
//	}
	
	
	//requestparam 이용 방법
//	@RequestMapping("/param")
//	public String param(@RequestParam("name") String name,
//						@RequestParam(value = "age", required = false, defaultValue = "0") String age,
//						@RequestParam(value = "inter", required = false, defaultValue = "") ArrayList<String> inter) {
//		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(inter.toString());
//		
//		
//		return "request/result";
//	}

	
	//커맨드 이용 방법
	@RequestMapping("/param")
	public String param(ReqVO vo) {
		
		System.out.println(vo.toString());
		
		return "request/result";
	}
	
}
