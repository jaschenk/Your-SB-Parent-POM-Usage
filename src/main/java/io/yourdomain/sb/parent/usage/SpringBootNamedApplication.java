package io.yourdomain.sb.parent.usage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootNamedApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootNamedApplication.class, args);
    }
}