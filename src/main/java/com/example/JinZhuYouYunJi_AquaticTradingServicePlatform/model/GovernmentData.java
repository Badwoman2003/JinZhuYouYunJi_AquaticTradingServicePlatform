package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model;

import java.util.Date;

public class GovernmentData {

    // 主键ID
    private Long id;

    // 数据类型（例如：法规、政策、统计数据等）
    private String dataType;

    // 数据标题
    private String title;

    // 数据描述
    private String description;

    // 发布日期
    private Date releaseDate;

    // 来源
    private String source;

    // 相关链接
    private String link;

    // 备注
    private String remarks;

    // 构造函数
    public GovernmentData() {
    }

    public GovernmentData(Long id, String dataType, String title, String description, Date releaseDate, String source, String link, String remarks) {
        this.id = id;
        this.dataType = dataType;
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.source = source;
        this.link = link;
        this.remarks = remarks;
    }

    // Getter和Setter方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
