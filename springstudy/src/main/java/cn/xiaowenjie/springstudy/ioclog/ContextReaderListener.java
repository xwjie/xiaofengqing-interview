package cn.xiaowenjie.springstudy.ioclog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * ContextReaderListener是BOOT的扩展，不是IoC扩展
 */
@Component
public class ContextReaderListener implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private InvokeOtherService invokeOtherService;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        invokeOtherService.startInvoke();
    }
}
