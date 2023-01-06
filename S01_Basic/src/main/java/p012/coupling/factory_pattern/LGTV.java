package p012.coupling.factory_pattern;

public class LGTV implements TV {

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
