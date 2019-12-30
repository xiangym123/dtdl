package com.xiang.jtproxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new ProxyRealSubject(new RealSubject());
		subject.doSomething();
	}

}
