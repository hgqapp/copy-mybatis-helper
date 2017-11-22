package com.cgling.mybatis.generator.config;

/**
 * @author houguangqiang
 * @date 2017-11-22
 * @since 1.0
 */
public class XClassPathEntry {

    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public abstract static class Builder{

        protected abstract void configureClassPathEntry(XClassPathEntry classPathEntry);

        public XClassPathEntry build(){
            XClassPathEntry classPathEntry = new XClassPathEntry();
            configureClassPathEntry(classPathEntry);
            return classPathEntry;
        }
    }
}
