package com.zebrunner.carina.demo.api.github.methods.issue;

import com.zebrunner.carina.demo.api.github.methods.GithubBaseMethod;

public class GetIssueMethod extends GithubBaseMethod {

    public GetIssueMethod() {
        super(null, "api/github/issue/_get/rs.json");
    }
}
