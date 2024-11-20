package com.zebrunner.carina.demo.api.github;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class PostIssueMethod extends AbstractApiMethodV2 {

    public PostIssueMethod() {
        super("api/github/issue/_post/rq.json", "api/github/issue/_post/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        request.header("Accept", "application/vnd.github.v3+json");
        request.header("Authorization", "Bearer " + Configuration.getRequired("github_token"));
    }
}
