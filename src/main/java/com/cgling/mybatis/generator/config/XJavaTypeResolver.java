package com.cgling.mybatis.generator.config;

/**
 * @author houguangqiang
 * @date 2017-11-21
 * @since 1.0
 */
public class XJavaTypeResolver extends XProperty {

    private String type;

    private Boolean forceBigDecimals;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getForceBigDecimals() {
        return forceBigDecimals;
    }

    public void setForceBigDecimals(Boolean forceBigDecimals) {
        put("forceBigDecimals", forceBigDecimals);
        this.forceBigDecimals = forceBigDecimals;
    }
}
