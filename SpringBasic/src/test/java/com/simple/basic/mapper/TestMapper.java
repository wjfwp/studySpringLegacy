package com.simple.basic.mapper;

public interface TestMapper {

	//xml에서 실행시킬 추상메서드
	public String getTime();
	
	//insert - 단일값 전달
	public int insertOne(String name);
	
	//insert - 다중값 전달
}
