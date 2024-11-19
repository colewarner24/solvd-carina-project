package com.zebrunner.carina.demo.api.github;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class RenameBranchMethod extends AbstractApiMethodV2 {

    public RenameBranchMethod() {
        super("api/github/branch/_rename/rq.json", "api/github/branch/_rename/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        request.header("Authorization", "Bearer " + Configuration.getRequired("github_token"));
    }

}
