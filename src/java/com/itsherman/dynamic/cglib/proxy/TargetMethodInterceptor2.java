package com.itsherman.dynamic.cglib.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.time.Instant;

public class TargetMethodInterceptor2 implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
        System.out.println(Instant.now().toString());
        Object returnObj = proxy.invokeSuper(o,objects);
        System.out.println(Instant.now().toString());
        return returnObj;
    }
}
