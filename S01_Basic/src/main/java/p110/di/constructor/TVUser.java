package p110.di.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	
	public static void main(String[] args) {
		// SonySpeaker speaker = new SonySpeaker();
		// TV tv1 = new SaumsungTV(speaker);
		
		// IoC에서 Constructor를 사용한 DI(Dependency Injection)사용
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext110.xml");
		
		
		TV tv = (TV) factory.getBean("tv");
		
		tv.turnOn();;
		tv.volumeDown();
		tv.volumeUp();
		tv.turnOff();
		
		factory.close();
	}

}
