package com.zebrunner.carina.demo.api.github.methods.user;

import com.zebrunner.carina.demo.api.github.methods.GithubBaseMethod;

public class GetUserByIdMethod extends GithubBaseMethod {

    public GetUserByIdMethod() {
        super(null, "api/github/user/_getbyid/rs.json");
    }

}
