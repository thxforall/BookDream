package p012.coupling.factory_pattern;

// instance를 만드는 공장
// 새로운 class가 생기면 지속적으로 소스코드를 수정해야함
// - application coding design pattern -> factory pattern
public class BeanFactory {
	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SaumsungTV();
		} else if (beanName.equals("lg")) {
			return new LGTV();
		}
		return null;
	}
	
}
