package p022.bean.properties;

public class SaumsungTV implements TV {
	public SaumsungTV() {
		System.out.println("1. SamsungTV 객체 생성");
	}
	
	public void initMethod() {
		System.out.println("2. 객체 초기화 작업 처리 ...");
	}
	
	public void destroyMethod() {
		System.out.println("END. 객체 삭제 전에 처리할  로직 처리 ...");
	}
	
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
