package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//Eureka的客戶端
@EnableEurekaClient
public class PlatServiceApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication8001.class);
    }
}
