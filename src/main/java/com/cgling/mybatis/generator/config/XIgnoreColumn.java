package com.cgling.mybatis.generator.config;

/**
 * @author houguangqiang
 * @date 2017-11-22
 * @since 1.0
 */
public class XIgnoreColumn {

    private String column;

    private Boolean delimitedColumnName;

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public Boolean getDelimitedColumnName() {
        return delimitedColumnName;
    }

    public void setDelimitedColumnName(Boolean delimitedColumnName) {
        this.delimitedColumnName = delimitedColumnName;
    }
    
    public abstract static class Builder{

        protected abstract void configureIgnoreColumn(XIgnoreColumn ignoreColumn);

        public XIgnoreColumn build(){
            XIgnoreColumn ignoreColumn = new XIgnoreColumn();
            configureIgnoreColumn(ignoreColumn);
            return ignoreColumn;
        }
    }
}
