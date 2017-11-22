package com.cgling.mybatis.generator.config;

/**
 * @author houguangqiang
 * @date 2017-11-21
 * @since 1.0
 */
public class XJavaClientGenerator extends XProperty {

    private String targetPackage;
    private String targetProject;
    private String type = "XMLMAPPER";
    private String implementationPackage;

    private Boolean enableSubPackages;
    private String exampleMethodVisibility;
    private String methodNameCalculator;
    private String rootInterface;
    private Boolean useLegacyBuilder;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImplementationPackage() {
        return implementationPackage;
    }

    public void setImplementationPackage(String implementationPackage) {
        this.implementationPackage = implementationPackage;
    }

    public Boolean getEnableSubPackages() {
        return enableSubPackages;
    }

    public void setEnableSubPackages(Boolean enableSubPackages) {
        put("enableSubPackages", enableSubPackages);
        this.enableSubPackages = enableSubPackages;
    }

    public String getExampleMethodVisibility() {
        return exampleMethodVisibility;
    }

    public void setExampleMethodVisibility(String exampleMethodVisibility) {
        put("exampleMethodVisibility", exampleMethodVisibility);
        this.exampleMethodVisibility = exampleMethodVisibility;
    }

    public String getMethodNameCalculator() {
        return methodNameCalculator;
    }

    public void setMethodNameCalculator(String methodNameCalculator) {
        put("methodNameCalculator", methodNameCalculator);
        this.methodNameCalculator = methodNameCalculator;
    }

    public String getRootInterface() {
        return rootInterface;
    }

    public void setRootInterface(String rootInterface) {
        put("rootInterface", rootInterface);
        this.rootInterface = rootInterface;
    }

    public Boolean getUseLegacyBuilder() {
        return useLegacyBuilder;
    }

    public void setUseLegacyBuilder(Boolean useLegacyBuilder) {
        put("useLegacyBuilder", useLegacyBuilder);
        this.useLegacyBuilder = useLegacyBuilder;
    }
}
