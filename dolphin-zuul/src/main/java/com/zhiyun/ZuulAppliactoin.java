package com.zhiyun;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@SpringBootApplication
@EnableZuulProxy
public class ZuulAppliactoin {

    public static void main(String[] args) {
        SpringApplication.run(ZuulAppliactoin.class, args);
    }
}
