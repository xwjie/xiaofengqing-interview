package cn.xiaowenjie.springstudy.iocdemo.beans;

import org.springframework.beans.factory.BeanNameAware;

public class Apple implements BeanNameAware {
    public Apple(){
        System.out.println("APPLE NEW");
    }

    @Override
    public void setBeanName(String name) {
        // NO INVOKE
        System.out.println("APPLE: my name is = " + name);
    }
}
