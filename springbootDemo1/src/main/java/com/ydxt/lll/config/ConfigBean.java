package com.ydxt.lll.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author : 147805
 * @Description :
 * Created by 147805 on 2018/4/12.
 */

@Configuration
@ConfigurationProperties(prefix = "com.test1")
@PropertySource("classpath:application.properties")
public class ConfigBean {
    private String name;
    private String want;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }
}
