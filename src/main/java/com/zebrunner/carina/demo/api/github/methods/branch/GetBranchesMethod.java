package com.zebrunner.carina.demo.api.github.methods.branch;

import com.zebrunner.carina.demo.api.github.methods.GithubBaseMethod;

public class GetBranchesMethod extends GithubBaseMethod {

    public GetBranchesMethod() {
        super(null, "api/github/branch/_getall/rs.json");
    }

}
