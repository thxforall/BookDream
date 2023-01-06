package p110.di.constructor2;

public class SaumsungTV implements TV {
	private SonySpeaker speaker;
	private int price;
	
	public SaumsungTV() {
		System.out.println("SamsungTV(1) 객체 생성");
	}
	
	public SaumsungTV(SonySpeaker speaker) {
		System.out.println("SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	
	public SaumsungTV(SonySpeaker speaker, int price) {
		System.out.println("SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Samsung TV --- On");
		System.out.println("Price : " + this.price);
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
