package com.zebrunner.carina.demo.api.github.methods;

public class RenameBranchMethod extends GithubBaseMethod {

    public RenameBranchMethod() {
        super("api/github/branch/_rename/rq.json", "api/github/branch/_rename/rs.json");
    }
}
