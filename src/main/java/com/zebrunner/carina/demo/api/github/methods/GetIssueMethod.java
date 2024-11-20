package com.zebrunner.carina.demo.api.github.methods;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class GetIssueMethod extends GithubBaseMethod {

    public GetIssueMethod() {
        super(null, "api/github/issue/_get/rs.json");
    }
}
