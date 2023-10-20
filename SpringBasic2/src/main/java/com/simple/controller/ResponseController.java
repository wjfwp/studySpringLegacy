package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.ReqVO;

@Controller
@RequestMapping("/response")
public class ResponseController {
	
	@RequestMapping("/res_ex01")
	public String res_ex01() {
		return "response/res_ex01";
	}
	
	//model 전달자
	@RequestMapping("/ex02")
	public String ex02(Model model) {
		
		model.addAttribute("name", "홍길동");
		model.addAttribute("date", new Date() );
		
		return "response/ex02";
	}
	
	
	//ModelAndView 객체
	
	@RequestMapping("/ex03")
	public ModelAndView ex03() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("serverTime", new Date() );
		mv.setViewName("response/ex03");
		
		return mv;
	}
	
	//@ModelAtrribure
	@RequestMapping("/ex04")
	public String ex04(@ModelAttribute("id") String id) {
		
		System.out.println(id);
		return "response/ex04";
	}
	
	@RequestMapping("/ex05")
	public String ex05(@ModelAttribute("xxx") ReqVO vo) {
		
		System.out.println(vo.toString());
		
		return "response/ex05";
	}
	
	//RedirectAttribute
	@RequestMapping("/join")
	public void join() {
		
	}
	
	@RequestMapping(value="/joinForm", method=RequestMethod.POST)
	public String joinForm(ReqVO vo, RedirectAttributes ra) {
		
		ra.addFlashAttribute("msg", "정상처리 되었습니다.");
		return "redirect:/";
	}
	
	

}
