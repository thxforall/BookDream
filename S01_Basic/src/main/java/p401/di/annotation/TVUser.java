package p401.di.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	
	public static void main(String[] args) {
		
		// applicationContext401.xml
		// context:component-scan : bean으로 자동생성 할 package 지정
		// p401.di.annotation package내에 있는 class들에 대하여 bean으로 자동 생성
		// spring은 package내에 @Component annotation이 있는 class들에 대하여 bean 자동생성
		
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext401.xml");
		
		
		TV tv = (TV) factory.getBean("tv");
		
		tv.turnOn();;
		tv.volumeDown();
		tv.volumeUp();
		tv.turnOff();
		
		factory.close();
	}

}
