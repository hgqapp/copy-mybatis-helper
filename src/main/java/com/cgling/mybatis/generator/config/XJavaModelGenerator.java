package com.cgling.mybatis.generator.config;

/**
 * @author houguangqiang
 * @date 2017-11-21
 * @since 1.0
 */
public class XJavaModelGenerator extends XProperty {

    private String targetPackage;
    private String targetProject;

    private Boolean constructorBased;
    private Boolean enableSubPackages;
    private Boolean immutable;
    private String rootClass;
    private Boolean trimStrings;

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

    public Boolean getConstructorBased() {
        return constructorBased;
    }

    public void setConstructorBased(Boolean constructorBased) {
        put("constructorBased", constructorBased);
        this.constructorBased = constructorBased;
    }

    public Boolean getEnableSubPackages() {
        return enableSubPackages;
    }

    public void setEnableSubPackages(Boolean enableSubPackages) {
        put("enableSubPackages", enableSubPackages);
        this.enableSubPackages = enableSubPackages;
    }

    public Boolean getImmutable() {
        return immutable;
    }

    public void setImmutable(Boolean immutable) {
        put("immutable", immutable);
        this.immutable = immutable;
    }

    public String getRootClass() {
        return rootClass;
    }

    public void setRootClass(String rootClass) {
        put("rootClass", rootClass);
        this.rootClass = rootClass;
    }

    public Boolean getTrimStrings() {
        return trimStrings;
    }

    public void setTrimStrings(Boolean trimStrings) {
        put("trimStrings", trimStrings);
        this.trimStrings = trimStrings;
    }
}
