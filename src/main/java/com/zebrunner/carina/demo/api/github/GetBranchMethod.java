package com.zebrunner.carina.demo.api.github;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class GetBranchMethod extends AbstractApiMethodV2{

    public GetBranchMethod() {
        super(null, "api/github/branch/_get/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        request.header("Authorization", "Bearer " + Configuration.getRequired("github_token"));
    }
}
