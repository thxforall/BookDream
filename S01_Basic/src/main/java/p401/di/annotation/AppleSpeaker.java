package p401.di.annotation;

import org.springframework.stereotype.Component;

// id를 부여하지 않으면 spring이 자동으로 class이름으로 생성
@Component("apple")
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("--> Apple Speaker 객체 생성");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("Apple Speaker --- Volume Up");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("Apple Speaker --- Volume Down");
	}
}
