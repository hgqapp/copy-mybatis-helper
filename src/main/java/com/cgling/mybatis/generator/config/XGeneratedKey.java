package com.cgling.mybatis.generator.config;

/**
 * @author houguangqiang
 * @date 2017-11-21
 * @since 1.0
 */
public class XGeneratedKey {

    private String column;
    private String sqlStatement;
    private boolean identity;
    private String type;

    public XGeneratedKey() {
        setSqlStatement("JDBC");
        identity = true;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public boolean getIdentity() {
        return identity;
    }

    public void setIdentity(boolean identity) {
        this.identity = identity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
