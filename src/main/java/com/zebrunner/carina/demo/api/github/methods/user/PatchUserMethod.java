package com.zebrunner.carina.demo.api.github.methods.user;

import com.zebrunner.carina.demo.api.github.methods.GithubBaseMethod;

public class PatchUserMethod extends GithubBaseMethod {

    public PatchUserMethod() {
        super("api/github/user/_patch/rq.json", "api/github/user/_patch/rs.json");
    }

}
