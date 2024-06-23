package com.example.JinZhuYouYunJi_AquaticTradingServicePlatform.model;

public class Member {
    // 主键，会员id
    private Long member_id;
    // 会员名称
    private String member_name;
    // 会员密码
    private Long password;
    // 联系电话
    private String member_phone;
    // 邮箱地址
    private String member_email;

    // 无参构造方法
    public Member() {}

    // 带参构造方法
    public Member(Long member_id, String member_name, Long password, String member_phone) {
        this.member_id = member_id;
        this.member_name = member_name;
        this.password = password;
        this.member_phone = member_phone;
        this.member_email = member_phone; // This seems incorrect. Do you want to set the email to the phone number?
    }

    // Getter and Setter methods
    public Long getMember_id() {
        return member_id;
    }

    public void setMember_id(Long member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }

    public String getMember_phone() {
        return member_phone;
    }

    public void setMember_phone(String member_phone) {
        this.member_phone = member_phone;
    }

    public String getMember_email() {
        return member_email;
    }

    public void setMember_email(String member_email) {
        this.member_email = member_email;
    }
}

