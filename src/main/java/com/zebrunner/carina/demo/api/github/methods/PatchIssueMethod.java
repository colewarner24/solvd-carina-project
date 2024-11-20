package com.zebrunner.carina.demo.api.github.methods;

public class PatchIssueMethod extends GithubBaseMethod {

    public PatchIssueMethod() {
        super("api/github/issue/_patch/rq.json", "api/github/issue/_patch/rs.json");
    }
}
