package com.zebrunner.carina.demo.api.github;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class PatchUserMethod extends AbstractApiMethodV2 {

    public PatchUserMethod() {
        super("api/github/user/_patch/rq.json", "api/github/user/_patch/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        request.header("Authorization", "Bearer " + Configuration.getRequired("github_token"));
    }

}
