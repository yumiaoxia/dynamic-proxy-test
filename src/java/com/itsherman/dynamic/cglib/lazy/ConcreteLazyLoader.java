package com.itsherman.dynamic.cglib.lazy;

import net.sf.cglib.proxy.LazyLoader;

public class ConcreteLazyLoader implements LazyLoader {

    public Object loadObject() throws Exception {
        System.out.println("LazyLoader load Object...");
        PropertyBean propertyBean = new PropertyBean();
        propertyBean.setPropertyName("lazy property name");
        propertyBean.setPropertyValue(111);
        return propertyBean;
    }
}
