package com.cgling.mybatis.example.model;

import javax.annotation.Generated;

public class UserInfo {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.164+08:00", comments="Source field: user_info.user_id")
    private Long userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.175+08:00", comments="Source field: user_info.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.175+08:00", comments="Source field: user_info.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.175+08:00", comments="Source field: user_info.alias")
    private String alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.175+08:00", comments="Source field: user_info.mobile")
    private String mobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.176+08:00", comments="Source field: user_info.email")
    private String email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.177+08:00", comments="Source field: user_info.duty")
    private String duty;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.177+08:00", comments="Source field: user_info.wx_user_id")
    private String wxUserId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.178+08:00", comments="Source field: user_info.internal")
    private Byte internal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.178+08:00", comments="Source field: user_info.default_group_id")
    private Long defaultGroupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.status")
    private Byte status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.create_time")
    private Long createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.attempt_time")
    private Long attemptTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.attempt_ip")
    private String attemptIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.is_delete")
    private Byte isDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.18+08:00", comments="Source field: user_info.is_solute")
    private Byte isSolute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.18+08:00", comments="Source field: user_info.solute_period")
    private Byte solutePeriod;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.174+08:00", comments="Source field: user_info.user_id")
    public Long getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.174+08:00", comments="Source field: user_info.user_id")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.175+08:00", comments="Source field: user_info.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.175+08:00", comments="Source field: user_info.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.175+08:00", comments="Source field: user_info.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.175+08:00", comments="Source field: user_info.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.175+08:00", comments="Source field: user_info.alias")
    public String getAlias() {
        return alias;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.175+08:00", comments="Source field: user_info.alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.175+08:00", comments="Source field: user_info.mobile")
    public String getMobile() {
        return mobile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.176+08:00", comments="Source field: user_info.mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.176+08:00", comments="Source field: user_info.email")
    public String getEmail() {
        return email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.177+08:00", comments="Source field: user_info.email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.177+08:00", comments="Source field: user_info.duty")
    public String getDuty() {
        return duty;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.177+08:00", comments="Source field: user_info.duty")
    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.178+08:00", comments="Source field: user_info.wx_user_id")
    public String getWxUserId() {
        return wxUserId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.178+08:00", comments="Source field: user_info.wx_user_id")
    public void setWxUserId(String wxUserId) {
        this.wxUserId = wxUserId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.178+08:00", comments="Source field: user_info.internal")
    public Byte getInternal() {
        return internal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.178+08:00", comments="Source field: user_info.internal")
    public void setInternal(Byte internal) {
        this.internal = internal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.default_group_id")
    public Long getDefaultGroupId() {
        return defaultGroupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.default_group_id")
    public void setDefaultGroupId(Long defaultGroupId) {
        this.defaultGroupId = defaultGroupId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.status")
    public Byte getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.status")
    public void setStatus(Byte status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.create_time")
    public Long getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.create_time")
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.attempt_time")
    public Long getAttemptTime() {
        return attemptTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.attempt_time")
    public void setAttemptTime(Long attemptTime) {
        this.attemptTime = attemptTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.attempt_ip")
    public String getAttemptIp() {
        return attemptIp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.attempt_ip")
    public void setAttemptIp(String attemptIp) {
        this.attemptIp = attemptIp;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.is_delete")
    public Byte getIsDelete() {
        return isDelete;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.179+08:00", comments="Source field: user_info.is_delete")
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.18+08:00", comments="Source field: user_info.is_solute")
    public Byte getIsSolute() {
        return isSolute;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.18+08:00", comments="Source field: user_info.is_solute")
    public void setIsSolute(Byte isSolute) {
        this.isSolute = isSolute;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.18+08:00", comments="Source field: user_info.solute_period")
    public Byte getSolutePeriod() {
        return solutePeriod;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.18+08:00", comments="Source field: user_info.solute_period")
    public void setSolutePeriod(Byte solutePeriod) {
        this.solutePeriod = solutePeriod;
    }
}