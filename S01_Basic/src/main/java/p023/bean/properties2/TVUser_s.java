package p023.bean.properties2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser_s {
	
	public static void main(String[] args) {
		
		// applicationContext022.xml의 bean tag에서 사용하는 속성(property)
		// scope = "singleton"
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext023s.xml");
		
		
		TV tv = (TV) factory.getBean("tv");
		
		// getBean을 통해 새로운 객체를 생성해서 주는 것이 아니라, 기존에 생성된 객체를 넘겨줌
		// singleton design pattern -> default singleton 권장
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
