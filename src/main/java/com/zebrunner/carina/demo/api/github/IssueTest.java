package com.zebrunner.carina.demo.api.github;

import com.zebrunner.carina.api.apitools.builder.PropertiesProcessor;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;

public class IssueTest extends AbstractTest {

    @Test(description = "JIRA-1234")
    @MethodOwner(owner = "cjwarner")
    public void PostIssueTest() {
        PostIssueMethod apiIssue = new PostIssueMethod();
        apiIssue.expectResponseStatus(HttpResponseStatusType.OK_200);
        apiIssue.callAPI();
        apiIssue.getProperties().remove("updated_at");
        apiIssue.getProperties().remove("created_at");
        apiIssue.validateResponse();
    }

    @Test(description = "JIRA-1235")
    @MethodOwner(owner = "cjwarner")
    public void GetIssueTest() {
        GetIssueMethod apiIssue = new GetIssueMethod();
        apiIssue.expectResponseStatus(HttpResponseStatusType.OK_200);
        apiIssue.callAPI();
        apiIssue.validateResponse();
    }

    @Test(description = "JIRA-1236")
    @MethodOwner(owner = "cjwarner")
    public void PatchIssueTest() {
        PatchIssueMethod apiIssue = new PatchIssueMethod();
        apiIssue.expectResponseStatus(HttpResponseStatusType.OK_200);
        apiIssue.callAPI();
        apiIssue.getProperties().remove("updated_at");
        apiIssue.getProperties().remove("created_at");
        apiIssue.validateResponse();
    }

    @Test(description = "JIRA-1237")
    @MethodOwner(owner = "cjwarner")
    public void DeleteIssueTest() {
        DeleteIssueMethod apiIssue = new DeleteIssueMethod();
        apiIssue.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
        apiIssue.callAPI();
        apiIssue.validateResponse();
    }
}
