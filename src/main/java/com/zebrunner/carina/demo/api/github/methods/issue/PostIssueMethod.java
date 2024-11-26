package com.zebrunner.carina.demo.api.github.methods.issue;

import com.zebrunner.carina.demo.api.github.methods.GithubBaseMethod;

public class PostIssueMethod extends GithubBaseMethod {

    public PostIssueMethod() {
        super("api/github/issue/_post/rq.json", "api/github/issue/_post/rs.json");
    }
}
