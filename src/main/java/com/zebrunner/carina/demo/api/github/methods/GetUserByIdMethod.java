package com.zebrunner.carina.demo.api.github.methods;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class GetUserByIdMethod extends GithubBaseMethod {

    public GetUserByIdMethod() {
        super(null, "api/github/user/_getbyid/rs.json");
    }

}
