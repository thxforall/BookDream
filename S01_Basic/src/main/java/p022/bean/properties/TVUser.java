package p022.bean.properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	
	public static void main(String[] args) {
		
		// applicationContext022.xml의 bean tag에서 사용하는 속성(property)
		// 1. init-method : Spring container가 bean 객체 생성 후 호출
		// 2. destroy-method : Spring container가 해단 bean객체 삭제하기 직전에 호출 
		// 3. lazy-init : Spring container가 해당 bean 객체를 미리 생성하지 않고 클라이언트가 요청시점에 생성
		
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext022.xml");
		
		
		TV tv = (TV) factory.getBean("tv");
		
		tv.turnOn();;
		tv.volumeDown();
		tv.volumeUp();
		tv.turnOff();
		
		factory.close();
	}

}
