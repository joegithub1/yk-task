package com.ykwl.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ClassName HelloRunner
 * @Description:
 * @Author huangjian
 * @Date 2022/5/26
 **/
@Slf4j
@Component
public class HelloRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
       log.info("HelloRunner task run...");
       Thread.sleep(1000 * 60 * 5);
    }
}
