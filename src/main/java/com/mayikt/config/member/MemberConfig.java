package com.mayikt.config.member;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2021/1/22.
 */

@ConfigurationProperties("spring.datasource.member")
@Data
public class MemberConfig {

    private String url;
    private String username;
    private String password;
    private Integer borrowConnectionTimeout;
    private Integer loginTimeout;
    private Integer maintenancelInterval;
    private Integer maxIdleTime;
    private Integer maxLifeTime;
    private Integer maxPoolSize;
    private Integer minPoolSize;
    private String uniqueResourceName;
    private String testQuery;


}
