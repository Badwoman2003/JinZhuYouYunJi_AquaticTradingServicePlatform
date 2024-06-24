package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model;

import java.util.Date;

public class FarmingInfo {

    // 主键ID
    private Long id;

    // 养殖户名称
    private String farmerName;

    // 养殖种类
    private String species;

    // 养殖规模（例如：面积、数量等）
    private String scale;

    // 地点
    private String location;

    // 联系电话
    private String contactNumber;

    // 养殖开始日期
    private Date startDate;

    // 备注
    private String remarks;

    // 构造函数
    public FarmingInfo() {
    }

    public FarmingInfo(Long id, String farmerName, String species, String scale, String location, String contactNumber, Date startDate, String remarks) {
        this.id = id;
        this.farmerName = farmerName;
        this.species = species;
        this.scale = scale;
        this.location = location;
        this.contactNumber = contactNumber;
        this.startDate = startDate;
        this.remarks = remarks;
    }

    // Getter和Setter方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}

