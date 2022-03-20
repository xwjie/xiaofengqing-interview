package cn.xiaowenjie.springstudy.ioclog;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Description TODO
 * @Date 2021/8/15 0015
 * @Author 晓风轻 https://github.com/xwjie
 */
@Component
public class Bean3 implements BeanNameAware, InitializingBean {

    @PostConstruct
    public void init() {
        System.out.println("Bean3 PostConstruct");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean3 setBeanName");
    }

    @Override
    // InitializingBean
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean3 afterPropertiesSet");
    }
}
