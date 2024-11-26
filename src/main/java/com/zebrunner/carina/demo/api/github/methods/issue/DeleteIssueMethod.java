package com.zebrunner.carina.demo.api.github.methods.issue;

import com.zebrunner.carina.demo.api.github.methods.GithubBaseMethod;

public class DeleteIssueMethod extends GithubBaseMethod {

    public DeleteIssueMethod() {
        super(null, "api/github/issue/_delete/rs.json");
    }
}
