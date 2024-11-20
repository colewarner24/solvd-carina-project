package com.zebrunner.carina.demo.api.github;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class GetIssueMethod extends AbstractApiMethodV2 {

    public GetIssueMethod() {
        super(null, "api/github/issue/_get/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        request.header("Accept", "application/vnd.github.v3+json");
        request.header("Authorization", "Bearer " + Configuration.getRequired("github_token"));
    }
}
