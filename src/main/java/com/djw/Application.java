package com.djw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: Application
 * Package: com.djw
 * Description:
 *
 * @Author lyh
 * @Create 2023/5/23 11:17
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.djw.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
