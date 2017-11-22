package com.cgling.mybatis.generator.config;

/**
 * @author houguangqiang
 * @date 2017-11-21
 * @since 1.0
 */
public class XContext extends XProperty {

    private String id;
    private String defaultModelType;
    private String targetRuntime ;
    private String introspectedColumnImpl;

    private Boolean autoDelimitKeywords;
    private String beginningDelimiter;
    private String endingDelimiter;
    private String javaFileEncoding;
    private String javaFormatter;
    private String xmlFormatter;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDefaultModelType() {
        return defaultModelType;
    }

    public void setDefaultModelType(String defaultModelType) {
        this.defaultModelType = defaultModelType;
    }

    public String getTargetRuntime() {
        return targetRuntime;
    }

    public void setTargetRuntime(String targetRuntime) {
        this.targetRuntime = targetRuntime;
    }

    public String getIntrospectedColumnImpl() {
        return introspectedColumnImpl;
    }

    public void setIntrospectedColumnImpl(String introspectedColumnImpl) {
        this.introspectedColumnImpl = introspectedColumnImpl;
    }

    public Boolean isAutoDelimitKeywords() {
        return autoDelimitKeywords;
    }

    public void setAutoDelimitKeywords(Boolean autoDelimitKeywords) {
        put("autoDelimitKeywords", autoDelimitKeywords);
        this.autoDelimitKeywords = autoDelimitKeywords;
    }

    public String getBeginningDelimiter() {
        return beginningDelimiter;
    }

    public void setBeginningDelimiter(String beginningDelimiter) {
        put("beginningDelimiter", beginningDelimiter);
        this.beginningDelimiter = beginningDelimiter;
    }

    public String getEndingDelimiter() {
        return endingDelimiter;
    }

    public void setEndingDelimiter(String endingDelimiter) {
        put("endingDelimiter", endingDelimiter);
        this.endingDelimiter = endingDelimiter;
    }

    public String getJavaFileEncoding() {
        return javaFileEncoding;
    }

    public void setJavaFileEncoding(String javaFileEncoding) {
        put("javaFileEncoding", javaFileEncoding);
        this.javaFileEncoding = javaFileEncoding;
    }

    public String getJavaFormatter() {
        return javaFormatter;
    }

    public void setJavaFormatter(String javaFormatter) {
        put("javaFormatter", javaFormatter);
        this.javaFormatter = javaFormatter;
    }

    public String getXmlFormatter() {
        return xmlFormatter;
    }

    public void setXmlFormatter(String xmlFormatter) {
        put("xmlFormatter", xmlFormatter);
        this.xmlFormatter = xmlFormatter;
    }
}
