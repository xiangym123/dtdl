package com.xiang;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.xiang.jtproxy.Subject;

public class NormalHandler implements InvocationHandler {
	private Object target;

    public NormalHandler(Object target) {
        this.target = target;
    }
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("念。。。。。。。。。。。。。。。。");		
		method.invoke(target, args);
		System.out.println("朔。。。。。。。。。。。。。。。。");
		
		return null;
	}

}
