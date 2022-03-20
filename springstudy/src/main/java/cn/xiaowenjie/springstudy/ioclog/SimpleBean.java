package cn.xiaowenjie.springstudy.ioclog;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Description TODO
 * @Date 2021/8/15 0015
 * @Author 晓风轻 https://github.com/xwjie
 */
@Component
public class SimpleBean implements BeanNameAware, InitializingBean {

    int counts = 0;

    @PostConstruct
    public void init() {
        System.out.println("SimpleBean PostConstruct");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SimpleBean setBeanName");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SimpleBean afterPropertiesSet, count:" + (++counts));
    }
}
