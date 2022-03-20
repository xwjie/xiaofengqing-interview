package cn.xiaowenjie.springstudy.iocdemo;

import cn.xiaowenjie.springstudy.iocdemo.beans.Apple;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class AppleFactoryBean implements FactoryBean <Apple>{
    public AppleFactoryBean(){
        System.out.println("AppleFactoryBean init");
    }

    @Override
    public Apple getObject() throws Exception {
        System.out.println("AppleFactoryBean: 相当于懒加载了！");
        return new Apple();
    }

    @Override
    public Class<?> getObjectType() {
        return Apple.class;
    }

    @Override
    public boolean isSingleton() {
        // 为什么下面这2个报错？
        // return super.isSingleton();
        // return FactoryBean.isSingleton();

        // 是super，不是super()
        return FactoryBean.super.isSingleton();
    }
}
