package com.itsherman.dynamic.cglib.dispatcher;

import com.itsherman.dynamic.cglib.lazy.PropertyBean;
import net.sf.cglib.proxy.Dispatcher;

public class ConcreteDispatcher implements Dispatcher {

    public Object loadObject() throws Exception {
        System.out.println("Dispatcher load Object...");
        PropertyBean propertyBean = new PropertyBean();
        propertyBean.setPropertyName("Dispatcher property name");
        propertyBean.setPropertyValue(111);
        return propertyBean;
    }
}
