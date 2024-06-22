package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model;

import java.util.Date;

public class VolunteerService {

    // 主键ID
    private Long id;

    // 服务名称
    private String serviceName;

    // 志愿者名称
    private String volunteerName;

    // 服务描述
    private String description;

    // 开始日期
    private Date startDate;

    // 结束日期
    private Date endDate;

    // 联系电话
    private String contactNumber;

    // 地址
    private String address;

    // 相关链接
    private String link;

    // 备注
    private String remarks;

    // 构造函数
    public VolunteerService() {
    }

    public VolunteerService(Long id, String serviceName, String volunteerName, String description, Date startDate, Date endDate, String contactNumber, String address, String link, String remarks) {
        this.id = id;
        this.serviceName = serviceName;
        this.volunteerName = volunteerName;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.contactNumber = contactNumber;
        this.address = address;
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

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

