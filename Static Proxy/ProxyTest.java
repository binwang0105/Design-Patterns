package proxy;

import org.junit.Test;

public class ProxyTest {
	@Test
	public void test(){
		TargetInterface target = new TargetObject();
		TargetInterface proxy = new ProxyObject(target);
		proxy.business();
	}
}
