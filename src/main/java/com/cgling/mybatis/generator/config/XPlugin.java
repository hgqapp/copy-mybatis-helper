package com.cgling.mybatis.generator.config;

/**
 * @author houguangqiang
 * @date 2017-11-22
 * @since 1.0
 */
public class XPlugin extends XProperty {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract static class Builder{

        protected abstract void configurePlugin(XPlugin plugin);

        public XPlugin build(){
            XPlugin plugin = new XPlugin();
            configurePlugin(plugin);
            return plugin;
        }
    }
}
