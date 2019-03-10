package com.sgcc.xdvideo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sgcc.xdvideo.mapper")
public class XdvideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(XdvideoApplication.class, args);
    }

}
