package com.itsherman.dynamic.cglib.dispatcher;

import com.itsherman.dynamic.cglib.lazy.PropertyBean;
import net.sf.cglib.proxy.Enhancer;

public class DispatcherBean {
    private String name;
    private Integer value;
    private PropertyBean propertyBean;

    public DispatcherBean() {
        this.name = "Dispatcher Name";
        this.value =1;
        this.propertyBean = createPropertyBean();
    }

    private PropertyBean createPropertyBean() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PropertyBean.class);
        return (PropertyBean)enhancer.create(PropertyBean.class,new ConcreteDispatcher());
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

    public PropertyBean getPropertyBean() {
        return propertyBean;
    }
}
