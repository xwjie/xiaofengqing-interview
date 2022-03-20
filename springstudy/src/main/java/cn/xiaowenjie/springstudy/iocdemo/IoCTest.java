package cn.xiaowenjie.springstudy.iocdemo;

import cn.xiaowenjie.springstudy.iocdemo.beans.Apple;
import cn.xiaowenjie.springstudy.iocdemo.beans.BeanA;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;

/**
 * @Description TODO
 * @Date 2021/7/18 0018
 * @Author 晓风轻 https://github.com/xwjie
 */
public class IoCTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IoCConfig.
            class);

        System.out.println("------------------------------");
        System.out.println("context=" + context);

        BeanA beanA = (BeanA) context.getBean("beanA");
        Objects.nonNull(beanA);
        System.out.println("beanA=" + beanA);

        Apple apple = context.getBean(Apple.class);
        System.out.println("apple=" + apple);

        Apple apple2 = (Apple) context.getBean("apple");
        System.out.println("apple2=" + apple2);
    }

}
