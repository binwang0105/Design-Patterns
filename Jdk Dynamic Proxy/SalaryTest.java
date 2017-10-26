package proxy.jdk;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class SalaryTest {
	@Test
	public void test(){
		Logger logger = new Logger();
		Security security = new Security();
		Privilege privilege = new Privilege();
		privilege.setAccess("aaa");
		SalaryService target = new SalaryServiceImpl();
		MyInterceptor interceptor = new MyInterceptor(target,privilege,logger,security);
		SalaryService salaryService = (SalaryService)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), interceptor);
		salaryService.showSalary();
	}
}
