package p401.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("lg")
public class LGTV implements TV {
	Speaker speaker;
	public LGTV() {
		System.out.println("LG TV instance 생성");
	}

	@Override
	public void turnOn() {
		System.out.println("LG TV--- On");
	}

	@Override
	public void turnOff() {
		System.out.println("LG TV--- Off");
	}

	@Override
	public void volumeUp() {
		System.out.println("LG TV--- Sound Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("LG TV--- Sound Down");
	}

}
