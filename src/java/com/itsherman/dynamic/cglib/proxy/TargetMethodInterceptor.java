package com.itsherman.dynamic.cglib.proxy;

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.omg.PortableInterceptor.Interceptor;

import java.lang.reflect.Method;

public class TargetMethodInterceptor implements MethodInterceptor {

    /**
     *
     * @param o 代理类实例
     * @param method 代理方法
     * @param objects 参数列表
     * @param proxy 方法代理
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
        System.out.println("Before: " + method);
        Object obj = proxy.invokeSuper(o,objects);
        System.out.println("After: " + method);
        return obj;
    }
}
