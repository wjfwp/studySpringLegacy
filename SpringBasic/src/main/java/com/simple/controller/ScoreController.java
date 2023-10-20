package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceImpl;

@Controller
@RequestMapping("/service")
public class ScoreController {
	
	//1st
	//ScoreService service = new ScoreServiceImpl();
	
	//2nd - 직접 빈으로 등록한 후 자동주입하는 방법
//	@Autowired
//	ScoreService service;

	//3rd
	@Autowired
	ScoreService service;
	
	
	//등록화면
	@RequestMapping("/scoreRegist")
	public String scoreRegist() {
		return "service/scoreRegist";
	}
	
	//목록화면
	@RequestMapping("/scoreList")
	public String scoreList() {
		return "service/scoreList";
	}
	
	//결과화면
	@RequestMapping("/scoreResult")
	public String scoreResult() {
		return "service/scoreResult";
	}
	
	//등록요청
	@RequestMapping(value = "/scoreForm", method=RequestMethod.POST)
	public String scoreForm(ScoreVO vo) {
		
		service.scoreRegist(vo);
		
		return "";
	}
}
