package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;

@Controller
@RequestMapping("/service")
public class ScoreController {

	@Autowired
	ScoreService service;
	
	@RequestMapping("/scoreRegist")
	public String scoreRegist() {
		return "service/scoreRegist";
	}
	
	@RequestMapping("/scoreList")
	public String scoreList() {
		return "service/scoreList";
	}
	
	@RequestMapping("/scoreResult")
	public String scoreResult() {
		return "service/scoreResult";
	}
	
	@RequestMapping("/scoreForm")
	public String scoreForm(ScoreVO vo) {
		
		service.scoreRegist(vo);
		
		return "";
	}
	
}
