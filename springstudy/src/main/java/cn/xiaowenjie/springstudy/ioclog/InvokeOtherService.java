package cn.xiaowenjie.springstudy.ioclog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InvokeOtherService{

    public void startInvoke(){
      log.info("start invoke....");
    }
}
