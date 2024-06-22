package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model;

import java.util.Date;

public class TradingMarket {

    // 主键ID
    private Long id;

    // 市场名称
    private String marketName;

    // 市场地点
    private String location;

    // 开放时间
    private Date openingTime;

    // 关闭时间
    private Date closingTime;

    // 联系电话
    private String contactNumber;

    // 市场描述
    private String description;

    // 市场类型（例如：批发市场、零售市场等）
    private String marketType;

    // 备注
    private String remarks;

    // 构造函数
    public TradingMarket() {
    }

    public TradingMarket(Long id, String marketName, String location, Date openingTime, Date closingTime, String contactNumber, String description, String marketType, String remarks) {
        this.id = id;
        this.marketName = marketName;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.contactNumber = contactNumber;
        this.description = description;
        this.marketType = marketType;
        this.remarks = remarks;
    }

    // Getter和Setter方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(Date openingTime) {
        this.openingTime = openingTime;
    }

    public Date getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(Date closingTime) {
        this.closingTime = closingTime;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}

