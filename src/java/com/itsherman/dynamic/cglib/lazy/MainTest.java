package com.itsherman.dynamic.cglib.lazy;

public class MainTest {

    public static void main(String[] args) {
        LoaderBean loaderBean = new LoaderBean();
        System.out.println(loaderBean.getLoadName());
        System.out.println(loaderBean.getLoadValue());
        PropertyBean propertyBean = loaderBean.getPropertyBean();
        System.out.println(propertyBean.getPropertyName());
        System.out.println(propertyBean.getPropertyValue());
        System.out.println("After...");
        System.out.println(propertyBean.getPropertyName());
    }
}
