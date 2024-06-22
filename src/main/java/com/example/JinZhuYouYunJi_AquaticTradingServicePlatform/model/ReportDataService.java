package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model;

import java.util.Date;

public class ReportDataService {

    // 主键ID
    private Long id;

    // 数据类型（例如：销售报告、生产报告等）
    private String dataType;

    // 报告标题
    private String title;

    // 报告内容
    private String content;

    // 提交日期
    private Date submissionDate;

    // 提交人
    private String submittedBy;

    // 联系电话
    private String contactNumber;

    // 相关链接
    private String link;

    // 备注
    private String remarks;

    // 构造函数
    public ReportDataService() {
    }

    public ReportDataService(Long id, String dataType, String title, String content, Date submissionDate, String submittedBy, String contactNumber, String link, String remarks) {
        this.id = id;
        this.dataType = dataType;
        this.title = title;
        this.content = content;
        this.submissionDate = submissionDate;
        this.submittedBy = submittedBy;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
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

