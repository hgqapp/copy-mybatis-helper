package com.cgling.mybatis.generator.config;

/**
 * @author houguangqiang
 * @date 2017-11-22
 * @since 1.0
 */
public class XCommentGenerator extends XProperty {

    private String type;

    private Boolean suppressAllComments;
    private Boolean addRemarkComments;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSuppressAllComments() {
        return suppressAllComments;
    }

    public void setSuppressAllComments(Boolean suppressAllComments) {
        put("suppressAllComments", suppressAllComments);
        this.suppressAllComments = suppressAllComments;
    }

    public Boolean getAddRemarkComments() {
        return addRemarkComments;
    }

    public void setAddRemarkComments(Boolean addRemarkComments) {
        put("addRemarkComments", addRemarkComments);
        this.addRemarkComments = addRemarkComments;
    }
}
