package com.imooc.security.core;

import com.imooc.security.core.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Desription:
 *
 * @ClassName SecurityCoreConfig
 * @Author Zhanyuwei
 * @Date 2019/10/19 14:52
 * @Version 1.0
 **/

@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {
}
