package com.cgling.mybatis.generator.config;

/**
 * @author houguangqiang
 * @date 2017-11-22
 * @since 1.0
 */
public class XColumnOverride extends XProperty {

    private String column;
    private String property;
    private String javaType;
    private String jdbcType;
    private String typeHandler;
    private boolean delimitedColumnName;
    private boolean isGeneratedAlways;

    private Boolean trimStrings;

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    public String getJdbcType() {
        return jdbcType;
    }

    public void setJdbcType(String jdbcType) {
        this.jdbcType = jdbcType;
    }

    public String getTypeHandler() {
        return typeHandler;
    }

    public void setTypeHandler(String typeHandler) {
        this.typeHandler = typeHandler;
    }

    public boolean getDelimitedColumnName() {
        return delimitedColumnName;
    }

    public void setDelimitedColumnName(boolean delimitedColumnName) {
        this.delimitedColumnName = delimitedColumnName;
    }

    public boolean getGeneratedAlways() {
        return isGeneratedAlways;
    }

    public void setGeneratedAlways(boolean generatedAlways) {
        isGeneratedAlways = generatedAlways;
    }

    public Boolean getTrimStrings() {
        return trimStrings;
    }

    public void setTrimStrings(Boolean trimStrings) {
        put("trimStrings", trimStrings);
        this.trimStrings = trimStrings;
    }

    public abstract static class Builder{

        protected abstract void configureColumnOverride(XColumnOverride columnOverride);

        public XColumnOverride build(){
            XColumnOverride columnOverride = new XColumnOverride();
            configureColumnOverride(columnOverride);
            return columnOverride;
        }
    }

}
