package com.ydxt.lll;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author : 147805
 * @Description :
 * Created by 147805 on 2018/4/12.
 */
@SpringBootApplication
@EnableSwagger2  //启动swagger
public class MyApplication {

    private final static Logger log = LoggerFactory.getLogger(MyApplication.class);

    public static void main(String[] args) {
        log.info("开始成功......");
        SpringApplication.run(MyApplication.class, args);
        log.info("启动成功......");
    }
}
