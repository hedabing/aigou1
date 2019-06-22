package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 配置类/启动类
 */

@SpringBootApplication
//Eureka的服务端
@EnableEurekaServer
public class EuerkaServiceApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run(EuerkaServiceApplication7001.class);
    }
}
