package p012.coupling.factory_pattern;

// coupling이 낮아짐
// class를 교체할 떄 소스코드를 수정해야만 함
public class TVUser {
	
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean(args[0]);
		
		tv.turnOn();;
		tv.volumeDown();
		tv.volumeUp();
		tv.turnOff();
	}

}
