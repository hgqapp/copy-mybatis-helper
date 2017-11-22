package com.cgling.mybatis.generator.config;

import java.util.HashMap;
import java.util.Map;

/**
 * @author houguangqiang
 * @date 2017-11-21
 * @since 1.0
 */
public class XProperty {

    private Map<String,String> properties = new HashMap<>();

    public Map<String, String> getProperties() {
        return properties;
    }

    public String get(String key){
        return properties.get(key);
    }

    public void put(String key, Object value) {
        if (key == null || value == null) {
            return;
        }
        properties.put(key, value.toString());
    }

}
