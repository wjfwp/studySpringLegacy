package com.simple.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.basic.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class) //Junit테스트 진행
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //테스트를 진행할 스프링 설정 파일
public class JDBCMybatis {

	@Autowired
	TestMapper testMapper;
	
//	@Test
//	public void testCode01() {
//		int result = testMapper.insertOne("test");
//		System.out.println("성공실패?:" + result);
//	}
	
	@Test
	public void testCode02() {
	}
	
	@Test
	public void testCode03() {
	}
	
	@Test
	public void testCode04() {
	}
	
}
