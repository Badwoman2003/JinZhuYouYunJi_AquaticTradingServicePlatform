package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model;

import java.util.Date;

public class ConsultationAndEventService {

    // 主键ID
    private Long id;

    // 服务名称
    private String serviceName;

    // 服务类型（咨询或活动）
    private String serviceType;

    // 服务描述
    private String description;

    // 开始日期
    private Date startDate;

    // 结束日期
    private Date endDate;

    // 联系人
    private String contactPerson;

    // 联系电话
    private String contactNumber;

    // 地址
    private String address;

    // 备注
    private String remarks;

    // 构造函数
    public ConsultationAndEventService() {
    }

    public ConsultationAndEventService(Long id, String serviceName, String serviceType, String description, Date startDate, Date endDate, String contactPerson, String contactNumber, String address, String remarks) {
        this.id = id;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.contactPerson = contactPerson;
        this.contactNumber = contactNumber;
        this.address = address;
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

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}

