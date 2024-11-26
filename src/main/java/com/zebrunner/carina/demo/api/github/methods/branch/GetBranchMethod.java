package com.zebrunner.carina.demo.api.github.methods.branch;

import com.zebrunner.carina.demo.api.github.methods.GithubBaseMethod;

public class GetBranchMethod extends GithubBaseMethod {

    public GetBranchMethod() {
        super(null, "api/github/branch/_get/rs.json");
    }
}
