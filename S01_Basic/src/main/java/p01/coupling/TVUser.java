package p01.coupling;

import p011.coupling.polymorphism.TV;

// coupling(결합응집도)이 높음

public class TVUser {
	
// 삼성 tv를 사용하거나 LG tv를 사용함
	public static void main(String[] args) {
 		// 1. Samsung TV
		SamsungTv tv = new SamsungTv();
		tv.powerOn();;
		tv.volumeDown();
		tv.volumeUp();
		tv.powerOff();
	}

}
