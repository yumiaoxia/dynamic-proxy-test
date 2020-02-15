package com.itsherman.dynamic.cglib.proxy;

import com.sun.glass.ui.MenuItem;
import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

public class TargetMethodFilter implements CallbackFilter {

    public int accept(Method method) {
        int result = 2;
        if(method.getName().equals("select")){
            result = 0;
        }else if(method.getName().equals("update")){
            result = 1;
        }
        return result;
    }
}
