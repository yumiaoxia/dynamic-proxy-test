package com.itsherman.dynamic.cglib.lazy;

import net.sf.cglib.proxy.Enhancer;

public class LoaderBean  {

    private String loadName;
    private Integer loadValue;
    private PropertyBean propertyBean;

    public LoaderBean() {
        this.loadName = "loadName";
        this.loadValue = 1;
        this.propertyBean = createPropertyBean();
    }

    private PropertyBean createPropertyBean() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PropertyBean.class);
        return (PropertyBean)enhancer.create(PropertyBean.class,new ConcreteLazyLoader());
    }

    public String getLoadName() {
        return loadName;
    }

    public Integer getLoadValue() {
        return loadValue;
    }

    public PropertyBean getPropertyBean() {
        return propertyBean;
    }
}
