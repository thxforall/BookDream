package p021.bean.basic;

public class SaumsungTV implements TV {

	@Override
	public void turnOn() {
		System.out.println("Samsung TV--- On");
	}

	@Override
	public void turnOff() {
		System.out.println("Samsung TV--- Off");
	}

	@Override
	public void volumeUp() {
		System.out.println("Samsung TV--- Volumne Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("Samsung TV--- Volumne Down");
	}

}
