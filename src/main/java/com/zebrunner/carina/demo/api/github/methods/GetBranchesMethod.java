package com.zebrunner.carina.demo.api.github.methods;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class GetBranchesMethod extends GithubBaseMethod {

    public GetBranchesMethod() {
        super(null, "api/github/branch/_getall/rs.json");
    }

}
