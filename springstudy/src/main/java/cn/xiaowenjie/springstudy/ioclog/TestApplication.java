package cn.xiaowenjie.springstudy.ioclog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("cn.xiaowenjie.springstudy.ioclog")
public class TestApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestApplication.class);
		System.out.println("context init end");
		System.out.println(context.getBeanDefinitionCount());

		System.out.println(context.getBean("bean3"));
	}

}
