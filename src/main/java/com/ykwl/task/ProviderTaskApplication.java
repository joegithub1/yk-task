package com.ykwl.task;

import com.ykwl.common.utils.SystemUtils;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
/**
 * @ClassName: ProviderBusinessApplication<br>
 * @Description: 定时任务相关操作<br>
 * @Copyright:YK future Copyright (c) 202<br>
 * @Company:YK future<br>
 *
 * @author <br>
 * @version V1.0<br>
 * @date 2022年5月26日<br>
 */
@SpringBootApplication
//@EnableAspectJAutoProxy
@EnableDiscoveryClient
@ComponentScan(basePackages = { "com.ykwl", "org.apache.dubbo" }) // , "com.multi.cache"
@MapperScan(basePackages = "com.ykwl.task.mapper")
//@EnableWebFlux
@EnableCaching
@Slf4j
@EnableDubbo
@EnableTask //开启Spring Cloud Task
public class ProviderTaskApplication {

    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        SystemUtils.disableAccessWarnings();
        SpringApplication.run(ProviderTaskApplication.class, args);
        long endTime = System.currentTimeMillis();
        long time = endTime - starTime;
        log.info("\nStart Time: " + time / 1000 + " s");
        log.info("...............................................................");
        log.info("..................Task Service starts successfully..................");
        log.info("...............................................................");
    }

}
