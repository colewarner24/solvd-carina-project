package com.zebrunner.carina.demo.api.github.methods;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class GetUserMethod extends GithubBaseMethod {

    public GetUserMethod() {
        super(null, "api/github/user/_get/rs.json");
    }

}
