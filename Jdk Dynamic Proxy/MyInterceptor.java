package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInterceptor implements InvocationHandler{
	
	private Object target;
	
	private Privilege privilege;
	
	private Logger logger;
	
	private Security security;
	
	public MyInterceptor(Object target,Privilege privilege,Logger logger,Security security){
		this.target = target;
		this.privilege = privilege;
		this.logger = logger;
		this.security = security;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("aaa");
		this.logger.logging();
		this.security.security();
		if(this.privilege.getAccess().equals("admin")){
			method.invoke(this.target, args);
		}else{
			System.out.println("Authentificaiton failed");
		}
		System.out.println("bbbbbbbbbbbbbbbbbb");
		return null;
	}

}
