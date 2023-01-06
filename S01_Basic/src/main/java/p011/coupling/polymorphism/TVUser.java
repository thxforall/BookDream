package p011.coupling.polymorphism;

import p011.coupling.polymorphism.TV;

// coupling이 낮아짐
// class를 교체할 떄 소스코드를 수정해야만 함
public class TVUser {
	
	public static void main(String[] args) {
//		TV tv = new SaumsungTV();
		TV tv = new LGTV();
		tv.turnOn();;
		tv.volumeDown();
		tv.volumeUp();
		tv.turnOff();
	}

}
