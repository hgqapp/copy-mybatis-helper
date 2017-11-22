package com.cgling.mybatis.generator.config;

/**
 * @author houguangqiang
 * @date 2017-11-22
 * @since 1.0
 */
public class XColumnRenamingRule {

    private String searchString;
    private String replaceString;

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public String getReplaceString() {
        return replaceString;
    }

    public void setReplaceString(String replaceString) {
        this.replaceString = replaceString;
    }
}
