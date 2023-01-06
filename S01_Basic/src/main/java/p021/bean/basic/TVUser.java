package p021.bean.basic;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	
	public static void main(String[] args) {
		
		// 1. Spring container 구동
		// applicationContext.xml에 등록된 bean을 찾아서 new로 instance 생성
		// Spring에서 bean을 자동생성할 때 사용하는 대표적인 class
		// 1) GenericXmlApplicationContext : java conde내에서 직접 class를 사용하여 bean(instance)을 생성
		// 2) XmlWebApplicationContext : spring이 자동으로 servlet 등 class등을 bean(instance)을 생성
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		
		// 2. Spring container로부터 필요한 객체 요청
		TV tv = (TV) factory.getBean("samsung");
		
		tv.turnOn();;
		tv.volumeDown();
		tv.volumeUp();
		tv.turnOff();
		
		// 3. Spring container 종료
		factory.close();
	}

}
