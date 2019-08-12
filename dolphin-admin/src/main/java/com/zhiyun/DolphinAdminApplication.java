package com.zhiyun;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;

@EnableAdminServer
@EnableEurekaClient
@Configuration
@SpringBootApplication
public class DolphinAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(DolphinAdminApplication.class, args);
    }

}
