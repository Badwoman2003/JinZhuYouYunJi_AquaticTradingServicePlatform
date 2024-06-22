package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model;

import java.util.Date;

public class Buyer {

    // 主键ID
    private Long id;

    // 采购商名称
    private String name;

    // 公司名称
    private String companyName;

    // 联系电话
    private String contactNumber;

    // 邮箱地址
    private String email;

    // 地址
    private String address;

    // 注册日期
    private Date registrationDate;

    // 备注
    private String remarks;

    // 构造函数
    public Buyer() {
    }

    public Buyer(Long id, String name, String companyName, String contactNumber, String email, String address, Date registrationDate, String remarks) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address;
        this.registrationDate = registrationDate;
        this.remarks = remarks;
    }

    // Getter和Setter方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}

