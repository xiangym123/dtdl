package com.xiang.jtproxy;

public class ProxyRealSubject implements Subject{
	private Subject subject;
	
	public ProxyRealSubject(Subject subject) {
		super();
		this.subject = subject;
	}

	@Override
	public void doSomething() {
		System.out.println("念。。。。。。。。。。。。。。。。");		
		subject.doSomething();	
		System.out.println("朔。。。。。。。。。。。。。。。。");		

	}

}
