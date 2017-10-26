package proxy;

public class ProxyObject implements TargetInterface{

	private TargetInterface target;  
	
	public ProxyObject(TargetInterface target){   
		this.target = target;
	}

	public void business() {
		System.out.println("aaaaa");
		this.target.business();
		System.out.println("bbbbb");
	}

}
