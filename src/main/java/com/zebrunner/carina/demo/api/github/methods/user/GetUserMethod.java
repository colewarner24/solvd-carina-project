package com.zebrunner.carina.demo.api.github.methods.user;

import com.zebrunner.carina.demo.api.github.methods.GithubBaseMethod;

public class GetUserMethod extends GithubBaseMethod {

    public GetUserMethod() {
        super(null, "api/github/user/_get/rs.json");
    }

}
