package ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex02.Hotel;


public class MainClass {

	public static void main(String[] args) {
		
		//자바 설정 파일을 읽을 때
		AnnotationConfigApplicationContext atx =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Hotel hotel = atx.getBean(Hotel.class);
		
		System.out.println(hotel);
		
		hotel.getChef().cooking();
	}
}
