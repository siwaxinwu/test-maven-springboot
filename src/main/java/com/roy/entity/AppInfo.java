package com.roy.entity;


import lombok.Data;

@Data
public class AppInfo {
    /** App id */
    private String appId;
    /** API 秘钥 */
    private String key;

    public AppInfo(String appId, String key) {
        this.appId = appId;
        this.key = key;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}