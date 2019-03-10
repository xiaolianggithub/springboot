package com.sgcc.xdvideo.controller;

import com.sgcc.xdvideo.config.WeChatConfig;
import com.sgcc.xdvideo.domain.Video;
import com.sgcc.xdvideo.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author xl
 * @Date 2019/3/10
 * @Version 1.0
 **/
@RestController
public class TestController {

    @Autowired
    private WeChatConfig weChatConfig;

    @Autowired
    private VideoMapper videoMapper;

    @RequestMapping("test")
    public String test(){
        List<Video> videos = videoMapper.listAll();
        return videos.toString();
    }
}
