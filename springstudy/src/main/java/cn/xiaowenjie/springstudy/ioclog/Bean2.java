package cn.xiaowenjie.springstudy.ioclog;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Description TODO
 * @Date 2021/8/15 0015
 * @Author 晓风轻 https://github.com/xwjie
 */
@Component
public class Bean2 implements BeanNameAware,    InitializingBean{
        @Autowired
    private Bean3 bean3;

    @PostConstruct
    public void init(){
        System.out.println("Bean2 PostConstruct");
        System.out.println("Bean2 依赖 Bean3");
    }
    
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean2 setBeanName");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean2 afterPropertiesSet");
    }

}
