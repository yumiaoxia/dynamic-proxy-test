package com.itsherman.dynamic.cglib.proxy;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

public class MainTest {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetBean.class);
        enhancer.setCallback(new TargetMethodInterceptor());
        TargetBean targetBean = (TargetBean)enhancer.create();
        targetBean.select();
        targetBean.update();

        System.out.println("=============================================================");

        // 可通过自定义拦截策略实现每个方法使用不同的回调
        // CallBackFilter的accept方法返回的是顺序，跟enhancer.setCallbacks()的参数列表位置一一对象
        Enhancer enhancer2 = new Enhancer();
        enhancer2.setSuperclass(TargetBean.class);
        enhancer2.setCallbacks(new Callback[]{new TargetMethodInterceptor(),new TargetMethodInterceptor2(), NoOp.INSTANCE});
        enhancer2.setCallbackFilter(new TargetMethodFilter());
        TargetBean targetBean2 = (TargetBean)enhancer2.create();
        targetBean2.select();
        targetBean2.update();
    }

}
