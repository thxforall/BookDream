package p110.di.constructor3;

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
