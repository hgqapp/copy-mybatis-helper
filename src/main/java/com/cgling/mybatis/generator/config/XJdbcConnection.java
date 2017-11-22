package com.cgling.mybatis.generator.config;

/**
 * @author houguangqiang
 * @date 2017-11-21
 * @since 1.0
 */
public class XJdbcConnection extends XProperty {

    private String driverClass;
    private String connectionURL;
    private String userId;
    private String password;

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getConnectionURL() {
        return connectionURL;
    }

    public void setConnectionURL(String connectionURL) {
        this.connectionURL = connectionURL;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
