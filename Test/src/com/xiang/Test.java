package com.xiang;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import sun.misc.ProxyGenerator;

import com.xiang.jtproxy.RealSubject;
import com.xiang.jtproxy.Subject;
public class Test {

	public static void main(String[] args) throws IOException {

		Subject s = new RealSubject();
		InvocationHandler invocationHandler = new NormalHandler(s);
		Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] {Subject.class},invocationHandler);
		subject.doSomething();
		String name = "D:\\$Proxy0.class";
		byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
				s.getClass().getSimpleName(), new Class[] {RealSubject.class});
		System.out.println(subject.getClass().getSimpleName());
		FileOutputStream out=new FileOutputStream(name);
		for(int i=0;i<proxyClassFile.length;i++) {
            out.write(proxyClassFile[i]);
        }
		out.close();
        System.out.println("Êä³ö³É¹¦"+name);
		
	}

}
