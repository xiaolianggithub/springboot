package com.sgcc.xdvideo.mapper;

import com.sgcc.xdvideo.domain.Video;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName VideoMapper
 * @Description TODO
 * @Author xl
 * @Date 2019/3/10
 * @Version 1.0
 **/
public interface VideoMapper {

    @Select("SELECT * FROM video")
    List<Video> listAll();

}
