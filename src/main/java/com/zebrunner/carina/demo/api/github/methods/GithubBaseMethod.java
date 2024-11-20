package com.zebrunner.carina.demo.api.github.methods;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public abstract class GithubBaseMethod extends AbstractApiMethodV2 {

    public GithubBaseMethod(String rqPath, String rsPath) {
        super(rqPath, rsPath);
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        request.header("Accept", "application/vnd.github.v3+json");
        request.header("Authorization", "Bearer " + Configuration.getRequired("github_token"));
    }
}
