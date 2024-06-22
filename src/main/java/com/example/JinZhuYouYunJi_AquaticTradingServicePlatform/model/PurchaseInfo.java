package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model;

import java.util.Date;

public class PurchaseInfo {

    // 主键ID
    private Long id;

    // 采购信息标题
    private String title;

    // 采购商品名称
    private String productName;

    // 采购数量
    private Integer quantity;

    // 单位（例如：kg, 件等）
    private String unit;

    // 采购描述
    private String description;

    // 发布日期
    private Date releaseDate;

    // 截止日期
    private Date deadline;

    // 联系人
    private String contactPerson;

    // 联系电话
    private String contactNumber;

    // 相关链接
    private String link;

    // 备注
    private String remarks;

    // 构造函数
    public PurchaseInfo() {
    }

    public PurchaseInfo(Long id, String title, String productName, Integer quantity, String unit, String description, Date releaseDate, Date deadline, String contactPerson, String contactNumber, String link, String remarks) {
        this.id = id;
        this.title = title;
        this.productName = productName;
        this.quantity = quantity;
        this.unit = unit;
        this.description = description;
        this.releaseDate = releaseDate;
        this.deadline = deadline;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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

