package p110.di.constructor;

public class SaumsungTV implements TV {
	private SonySpeaker speaker;
	
	public SaumsungTV() {
		System.out.println("SamsungTV(1) 객체 생성");
	}
	
	public SaumsungTV(SonySpeaker speaker) {
		System.out.println("SamsungTV(2) 객체 생성");
		this.speaker = speaker;
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
