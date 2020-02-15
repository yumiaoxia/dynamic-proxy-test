package com.itsherman.dynamic.cglib.dispatcher;

import com.itsherman.dynamic.cglib.lazy.LoaderBean;
import com.itsherman.dynamic.cglib.lazy.PropertyBean;

public class MainTest {

    public static void main(String[] args) {
        DispatcherBean dispatcherBean = new DispatcherBean();
        System.out.println(dispatcherBean.getName());
        System.out.println(dispatcherBean.getValue());
        PropertyBean propertyBean = dispatcherBean.getPropertyBean();
        System.out.println(propertyBean.getPropertyName());
        System.out.println(propertyBean.getPropertyValue());
        System.out.println("After...");
        System.out.println(propertyBean.getPropertyName());
        System.out.println(propertyBean.getPropertyValue());

    }
}
