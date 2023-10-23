package com.simple.basic.mapper;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

import com.simple.command.MemberVO;
import com.simple.command.ScoreVO;

public interface TestMapper {

	//xml에서 실행시킬 추상메서드
	public String getTime();
	
	//insert - 단일값 전달
	public int insertOne(String name);
	//insert - 다중값 전달
	public int insertTwo(ScoreVO vo);
	//insert - 다중값 전달(맵)
	public int insertThree(HashMap<String, Object> map);
	//insert - 매개변수가 여러개일 경우 - Param("이름")
	public int insertFour(@Param("name") String name, 
						  @Param("kor") String kor, 
						  @Param("eng") String eng);
	//update
	public boolean updateOwn(ScoreVO vo);
	
	
	
	//select - 파라미터를 넘기는 과정은 위와 동일하다.
	public ScoreVO selectOne(int num);
	//select - 반환유형이 맵
	public HashMap<String, Object> selectTwo(int num);
	//select
	public ArrayList< HashMap<String, Object> > selectThree();
	
	//join처리
	//M:1방식 - ORM은 M쪽에 변수를 추가
	public ArrayList<ScoreVO> joinOne();
	//1:M방식 - ORM은 직접처리
	public MemberVO joinTwo(String name);
	
	
}
