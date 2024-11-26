package tests;

import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.demo.api.github.methods.issue.DeleteIssueMethod;
import com.zebrunner.carina.demo.api.github.methods.issue.GetIssueMethod;
import com.zebrunner.carina.demo.api.github.methods.issue.PatchIssueMethod;
import com.zebrunner.carina.demo.api.github.methods.issue.PostIssueMethod;
import org.testng.annotations.Test;

public class IssueTest extends AbstractTest {

    @Test(description = "JIRA-1234", priority = 1)
    @MethodOwner(owner = "cjwarner")
    public void PostIssueTest() {
        PostIssueMethod apiIssue = new PostIssueMethod();
        apiIssue.expectResponseStatus(HttpResponseStatusType.OK_200);
        apiIssue.callAPI();
        apiIssue.validateResponse();
    }

    @Test(description = "JIRA-1235", priority = 2)
    @MethodOwner(owner = "cjwarner")
    public void GetIssueTest() {
        GetIssueMethod apiIssue = new GetIssueMethod();
        apiIssue.expectResponseStatus(HttpResponseStatusType.OK_200);
        apiIssue.callAPI();
        apiIssue.validateResponse();
    }

    @Test(description = "JIRA-1236", priority = 3)
    @MethodOwner(owner = "cjwarner")
    public void PatchIssueTest() {
        PatchIssueMethod apiIssue = new PatchIssueMethod();
        apiIssue.expectResponseStatus(HttpResponseStatusType.OK_200);
        apiIssue.callAPI();
        apiIssue.validateResponse();
    }

    @Test(description = "JIRA-1237", priority = 4)
    @MethodOwner(owner = "cjwarner")
    public void DeleteIssueTest() {
        DeleteIssueMethod apiIssue = new DeleteIssueMethod();
        apiIssue.expectResponseStatus(HttpResponseStatusType.NO_CONTENT_204);
        apiIssue.callAPI();
        apiIssue.validateResponse();
    }

}
