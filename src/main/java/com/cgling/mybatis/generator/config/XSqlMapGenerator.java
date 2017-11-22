package com.cgling.mybatis.generator.config;

/**
 * @author houguangqiang
 * @date 2017-11-21
 * @since 1.0
 */
public class XSqlMapGenerator extends XProperty {

    private String targetPackage;
    private String targetProject;

    private Boolean enableSubPackages;

    public String getTargetPackage() {
        return targetPackage;
    }

    public void setTargetPackage(String targetPackage) {
        this.targetPackage = targetPackage;
    }

    public String getTargetProject() {
        return targetProject;
    }

    public void setTargetProject(String targetProject) {
        this.targetProject = targetProject;
    }

    public Boolean getEnableSubPackages() {
        return enableSubPackages;
    }

    public void setEnableSubPackages(Boolean enableSubPackages) {
        put("enableSubPackages", enableSubPackages);
        this.enableSubPackages = enableSubPackages;
    }
}
