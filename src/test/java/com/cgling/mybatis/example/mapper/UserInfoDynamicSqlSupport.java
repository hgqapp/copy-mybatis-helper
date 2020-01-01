package com.cgling.mybatis.example.mapper;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;

public final class UserInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.187+08:00", comments="Source Table: user_info")
    public static final UserInfo userInfo = new UserInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.188+08:00", comments="Source field: user_info.user_id")
    public static final SqlColumn<Long> userId = userInfo.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.189+08:00", comments="Source field: user_info.username")
    public static final SqlColumn<String> username = userInfo.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.189+08:00", comments="Source field: user_info.password")
    public static final SqlColumn<String> password = userInfo.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.189+08:00", comments="Source field: user_info.alias")
    public static final SqlColumn<String> alias = userInfo.alias;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.189+08:00", comments="Source field: user_info.mobile")
    public static final SqlColumn<String> mobile = userInfo.mobile;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.189+08:00", comments="Source field: user_info.email")
    public static final SqlColumn<String> email = userInfo.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.189+08:00", comments="Source field: user_info.duty")
    public static final SqlColumn<String> duty = userInfo.duty;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.189+08:00", comments="Source field: user_info.wx_user_id")
    public static final SqlColumn<String> wxUserId = userInfo.wxUserId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.189+08:00", comments="Source field: user_info.internal")
    public static final SqlColumn<Byte> internal = userInfo.internal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.19+08:00", comments="Source field: user_info.default_group_id")
    public static final SqlColumn<Long> defaultGroupId = userInfo.defaultGroupId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.19+08:00", comments="Source field: user_info.status")
    public static final SqlColumn<Byte> status = userInfo.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.19+08:00", comments="Source field: user_info.create_time")
    public static final SqlColumn<Long> createTime = userInfo.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.19+08:00", comments="Source field: user_info.attempt_time")
    public static final SqlColumn<Long> attemptTime = userInfo.attemptTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.19+08:00", comments="Source field: user_info.attempt_ip")
    public static final SqlColumn<String> attemptIp = userInfo.attemptIp;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.191+08:00", comments="Source field: user_info.is_delete")
    public static final SqlColumn<Byte> isDelete = userInfo.isDelete;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.191+08:00", comments="Source field: user_info.is_solute")
    public static final SqlColumn<Byte> isSolute = userInfo.isSolute;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.191+08:00", comments="Source field: user_info.solute_period")
    public static final SqlColumn<Byte> solutePeriod = userInfo.solutePeriod;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2019-12-26T13:05:17.188+08:00", comments="Source Table: user_info")
    public static final class UserInfo extends SqlTable {
        public final SqlColumn<Long> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.CHAR);

        public final SqlColumn<String> alias = column("alias", JDBCType.VARCHAR);

        public final SqlColumn<String> mobile = column("mobile", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<String> duty = column("duty", JDBCType.VARCHAR);

        public final SqlColumn<String> wxUserId = column("wx_user_id", JDBCType.VARCHAR);

        public final SqlColumn<Byte> internal = column("internal", JDBCType.TINYINT);

        public final SqlColumn<Long> defaultGroupId = column("default_group_id", JDBCType.BIGINT);

        public final SqlColumn<Byte> status = column("status", JDBCType.TINYINT);

        public final SqlColumn<Long> createTime = column("create_time", JDBCType.BIGINT);

        public final SqlColumn<Long> attemptTime = column("attempt_time", JDBCType.BIGINT);

        public final SqlColumn<String> attemptIp = column("attempt_ip", JDBCType.VARCHAR);

        public final SqlColumn<Byte> isDelete = column("is_delete", JDBCType.TINYINT);

        public final SqlColumn<Byte> isSolute = column("is_solute", JDBCType.TINYINT);

        public final SqlColumn<Byte> solutePeriod = column("solute_period", JDBCType.TINYINT);

        public UserInfo() {
            super("user_info");
        }
    }
}