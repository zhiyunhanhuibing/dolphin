package com.zhiyun;
import com.zhiyun.utils.SpringContextHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @author Zheng Jie
 * @date 2018/11/15 9:20:19
 *
 */
@EnableAsync//EnableAsync注解的意思是可以异步执行，就是开启多线程的意思。可以标注在方法、类上。为了让@Async注解能够生效，还需要在Spring Boot的主程序中配置@EnableAsync
@SpringBootApplication
@EnableTransactionManagement//@EnableTransactionManagement 开启事务支持
@EnableEurekaClient //启动EnableEureka客户端
public class AppRun {

    public static void main(String[] args) {
        SpringApplication.run(AppRun.class, args);
    }

    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }
}
