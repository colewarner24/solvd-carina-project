package com.zebrunner.carina.demo.api.github.methods;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class DeleteIssueMethod extends GithubBaseMethod {

    public DeleteIssueMethod() {
        super(null, "api/github/issue/_delete/rs.json");
    }
}
