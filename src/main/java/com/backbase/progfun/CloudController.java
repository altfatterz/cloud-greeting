package com.backbase.progfun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    @Autowired
    private Environment environment;

    @RequestMapping("/cf")
    public CloudFoundryEnvironment info() {

        CloudFoundryEnvironment cloudEnv = new CloudFoundryEnvironment();
        cloudEnv.setInstanceId(environment.getProperty("vcap.application.instance_id"));
        cloudEnv.setVersion(environment.getProperty("vcap.application.version"));
        cloudEnv.setName(environment.getProperty("vcap.application.name"));

        return cloudEnv;
    }


}
