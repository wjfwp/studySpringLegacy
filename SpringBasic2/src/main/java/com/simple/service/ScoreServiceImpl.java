package com.simple.service;

import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;

@Service
public class ScoreServiceImpl implements ScoreService {

	@Override
	public void scoreRegist(ScoreVO vo) {
		System.out.println(vo.toString());
	}

}
