package p401.di.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// "tv" : instance로 생성이 될 bean id
// @Controller : Servlet class에 사용
// @Service : Service class에 사용
// @Repository : DAO class에 사용
@Component("tv")
public class SaumsungTV implements TV {
	// SamsungTV class에 Speaker로 생성된 instance를 setter
	// @Autowired
	// @Qualifier("apple")
	@Resource(name="sony") // Auto + Qual
	private Speaker speaker;
	
	public SaumsungTV() {
		System.out.println("SamsungTV(1) 객체 생성");
	}
	
	@Override
	public void turnOn() {
		System.out.println("Samsung TV --- On");
	}

	@Override
	public void turnOff() {
		System.out.println("Samsung TV --- Off");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

}
