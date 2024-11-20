package com.zebrunner.carina.demo.api.github;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class PatchIssueMethod extends AbstractApiMethodV2 {

    public PatchIssueMethod() {
        super("api/github/issue/_patch/rq.json", "api/github/issue/_patch/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        request.header("Accept", "application/vnd.github.v3+json");
        request.header("Authorization", "Bearer " + Configuration.getRequired("github_token"));
    }
}
