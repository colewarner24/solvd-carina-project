package com.zebrunner.carina.demo.api.github.methods.branch;

import com.zebrunner.carina.demo.api.github.methods.GithubBaseMethod;

public class RenameBranchMethod extends GithubBaseMethod {

    public RenameBranchMethod() {
        super("api/github/branch/_rename/rq.json", "api/github/branch/_rename/rs.json");
    }
}
