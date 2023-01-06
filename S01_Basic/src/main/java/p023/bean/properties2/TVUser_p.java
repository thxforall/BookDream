package p023.bean.properties2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser_p {
	
	public static void main(String[] args) {
		
		// applicationContext022.xml의 bean tag에서 사용하는 속성(property)
		// scope = "prototype"
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext023p.xml");
		
		
		TV tv = (TV) factory.getBean("tv");
		
		// getBean을 통해 새로운 객체를 생성
		// prototype design pattern
		TV tv2 = (TV) factory.getBean("tv");
		
		if(tv == tv2) {
			System.out.println("tv와 tv2는 같은 객체입니다.");
		} else {
			System.out.println("tv와 tv2는 다른 객체입니다.");
		}
		
		tv.turnOn();;
		tv.volumeDown();
		tv.volumeUp();
		tv.turnOff();
		
		
		factory.close();
	}

}
