package com.sgcc.xdvideo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName WeChatConfig
 * @Description 微信配置类
 * @Author xl
 * @Date 2019/3/10
 * @Version 1.0
 **/
@Component
@PropertySource(value = "classpath:application.properties")
public class WeChatConfig {

    /**
     * @description 公众号appid
     */
    @Value("${wxpay.appid}")
    private String appId;

    /**
     * @description 公众号appsecret
     */
    @Value("${wxpay.appsecret}")
    private String appSecret;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
