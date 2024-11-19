package com.zebrunner.carina.demo.api.github;

import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;

public class UserTest extends AbstractTest {

    @Test(description = "JIRA-1234")
    @MethodOwner(owner = "cjwarner")
    public void getUserTest() {
        GetUserMethod apiUser = new GetUserMethod();
        apiUser.expectResponseStatus(HttpResponseStatusType.OK_200);
        apiUser.callAPI();
        apiUser.validateResponse();
    }

    @Test(description = "JIRA-1235")
    @MethodOwner(owner = "cjwarner")
    public void patchUserTest() {
        PatchUserMethod apiUser = new PatchUserMethod();
        apiUser.expectResponseStatus(HttpResponseStatusType.OK_200);
        apiUser.callAPI();
        apiUser.validateResponse();
    }

    @Test(description = "JIRA-1236")
    @MethodOwner(owner = "cjwarner")
    public void getUserByIdTest() {
        GetUserByIdMethod apiUser = new GetUserByIdMethod();
        apiUser.expectResponseStatus(HttpResponseStatusType.OK_200);
        apiUser.callAPI();
        apiUser.validateResponse();
    }

}
