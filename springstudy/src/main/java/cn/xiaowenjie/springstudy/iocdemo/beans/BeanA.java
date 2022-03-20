package cn.xiaowenjie.springstudy.iocdemo.beans;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @Description TODO
 * @Date 2021/7/18 0018
 * @Author 晓风轻 https://github.com/xwjie
 */
public class BeanA  implements BeanNameAware {
    @Override
    public void setBeanName(String name) {
        System.out.println("BEAN A: my name is = " + name);
    }
}
