package com.sgcc.xdvideo.domain;


import java.time.LocalDateTime;

public class Video {


  private Long id;
  private String title;
  private String summary;
  private String coverImg;
  private Long viewNum;
  private Long price;
  private LocalDateTime createTime;
  private Long online;
  private Double point;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


  public String getCoverImg() {
    return coverImg;
  }

  public void setCoverImg(String coverImg) {
    this.coverImg = coverImg;
  }


  public Long getViewNum() {
    return viewNum;
  }

  public void setViewNum(Long viewNum) {
    this.viewNum = viewNum;
  }


  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }


  public LocalDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }


  public Long getOnline() {
    return online;
  }

  public void setOnline(Long online) {
    this.online = online;
  }


  public Double getPoint() {
    return point;
  }

  public void setPoint(Double point) {
    this.point = point;
  }

  @Override
  public String toString() {
    return "Video{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", summary='" + summary + '\'' +
            ", coverImg='" + coverImg + '\'' +
            ", viewNum=" + viewNum +
            ", price=" + price +
            ", createTime=" + createTime +
            ", online=" + online +
            ", point=" + point +
            '}';
  }

}
