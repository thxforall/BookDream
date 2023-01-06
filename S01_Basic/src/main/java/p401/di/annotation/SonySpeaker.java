package p401.di.annotation;

import org.springframework.stereotype.Component;

// @Component
@Component("sony")
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("--> Sony Speaker 객체 생성");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("Sony Speaker --- Volume Up");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("Sony Speaker --- Volume Down");
	}
}
