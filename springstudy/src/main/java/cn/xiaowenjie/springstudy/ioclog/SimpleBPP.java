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
public class SimpleBPP implements BeanNameAware, InitializingBean, BeanPostProcessor {

    int[] counts = new int[]{0, 0, 0};

    @PostConstruct
    public void init() {
        System.out.println("SimpleBPP PostConstruct");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SimpleBPP setBeanName");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SimpleBPP afterPropertiesSet, count:" + (++counts[0]));
    }

    @Override
    // BeanPostProcessor
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("SimpleBPP postProcessBeforeInitialization, count:" + (++counts[1]));
        return bean;
    }

    @Override
    // BeanPostProcessor
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("SimpleBPP postProcessAfterInitialization, count:" + (++counts[2]));
        return bean;
    }
}
