package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model;

import java.util.Date;

public class HelpInfo {

    // 主键ID
    private Long id;

    // 帮助信息标题
    private String title;

    // 帮助信息内容
    private String content;

    // 发布日期
    private Date releaseDate;

    // 联系人
    private String contactPerson;

    // 联系电话
    private String contactNumber;

    // 相关链接
    private String link;

    // 备注
    private String remarks;

    // 构造函数
    public HelpInfo() {
    }

    public HelpInfo(Long id, String title, String content, Date releaseDate, String contactPerson, String contactNumber, String link, String remarks) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.releaseDate = releaseDate;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
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

