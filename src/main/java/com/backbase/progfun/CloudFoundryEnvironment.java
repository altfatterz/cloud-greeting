package com.backbase.progfun;

/**
 * Created by Zoltan on 14/12/14.
 */
public class CloudFoundryEnvironment {

    private String instanceId;
    private String version;
    private String name;

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
