package com.zebrunner.carina.demo.api.github;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

public class GetUserByIdMethod extends AbstractApiMethodV2 {

    public GetUserByIdMethod() {
        super(null, "api/github/user/_getbyid/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        request.header("Authorization", "Bearer " + Configuration.getRequired("github_token"));
    }

}
