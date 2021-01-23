package com.mayikt;

import com.mayikt.config.member.MemberConfig;
import com.mayikt.config.order.OrderConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Administrator on 2021/1/22.
 */

@SpringBootApplication
@EnableConfigurationProperties({MemberConfig.class,OrderConfig.class})
public class SpringMybatis {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatis.class);
    }

}
