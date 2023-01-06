package p303.di.collection.map;

import java.util.Iterator;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanMap {
	public static void main(String[] args) {
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext303.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		Map<String, String> addressMap = bean.getAddressMap();
		Iterator<String> keys = addressMap.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println("key : " + key + " value : " + addressMap.get(key));
		}
		factory.close();
	}
}
