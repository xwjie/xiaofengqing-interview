package cn.xiaowenjie.springstudy.iocdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description TODO
 * @Date 2021/7/18 0018
 * @Author 晓风轻 https://github.com/xwjie
 */
@Configuration
// 可以引入配置文件
@ImportResource("classpath:beans.xml")
// 更加方便的用注解，扫描进去
@ComponentScan("cn.xiaowenjie.springstudy.iocdemo")
public class IoCConfig {
}
