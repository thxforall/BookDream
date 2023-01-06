package p110.di.constructor;

public class SonySpeaker {
	public SonySpeaker() {
		System.out.println("--> Sony Speaker 객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("Sony Speaker --- Volume Up");
	}
	
	public void volumeDown() {
		System.out.println("Sony Speaker --- Volume Down");
	}
}
