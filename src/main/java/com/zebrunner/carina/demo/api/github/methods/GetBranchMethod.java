package com.zebrunner.carina.demo.api.github.methods;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class GetBranchMethod extends GithubBaseMethod{

    public GetBranchMethod() {
        super(null, "api/github/branch/_get/rs.json");
    }
}
