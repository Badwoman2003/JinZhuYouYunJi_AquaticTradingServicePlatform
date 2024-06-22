package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model;

import java.util.Date;

public class Transaction {

    // 主键ID
    private Long id;

    // 交易编号
    private String transactionId;

    // 买方ID
    private Long buyerId;

    // 卖方ID
    private Long sellerId;

    // 商品名称
    private String productName;

    // 数量
    private Integer quantity;

    // 单位（例如：kg, 件等）
    private String unit;

    // 单价
    private Double unitPrice;

    // 总价
    private Double totalPrice;

    // 交易日期
    private Date transactionDate;

    // 状态（例如：已完成、进行中等）
    private String status;

    // 备注
    private String remarks;

    // 构造函数
    public Transaction() {
    }

    public Transaction(Long id, String transactionId, Long buyerId, Long sellerId, String productName, Integer quantity, String unit, Double unitPrice, Double totalPrice, Date transactionDate, String status, String remarks) {
        this.id = id;
        this.transactionId = transactionId;
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.productName = productName;
        this.quantity = quantity;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.transactionDate = transactionDate;
        this.status = status;
        this.remarks = remarks;
    }

    // Getter和Setter方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
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

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}

