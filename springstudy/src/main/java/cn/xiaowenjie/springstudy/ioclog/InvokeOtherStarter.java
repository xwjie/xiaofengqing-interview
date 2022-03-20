package cn.xiaowenjie.springstudy.ioclog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * ApplicationRunner是BOOT的扩展，不是IoC扩展
 */
@Component
public class InvokeOtherStarter implements ApplicationRunner {
    @Autowired
    private InvokeOtherService invokeOtherService;

//    @Override
//    public void run(String... args) throws Exception {
//
//    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        invokeOtherService.startInvoke();
    }
}
