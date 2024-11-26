package tests;

import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.demo.api.github.methods.branch.GetBranchMethod;
import com.zebrunner.carina.demo.api.github.methods.branch.RenameBranchMethod;
import org.testng.annotations.Test;
import com.zebrunner.carina.demo.api.github.methods.branch.GetBranchesMethod;

public class BranchTest extends AbstractTest {

    @Test(description = "JIRA-1234")
    @MethodOwner(owner = "cjwarner")
    public void getBranchesTest() {
        GetBranchesMethod apiBranch = new GetBranchesMethod();
        apiBranch.expectResponseStatus(HttpResponseStatusType.OK_200);
        apiBranch.callAPI();
        apiBranch.validateResponse();
    }

    @Test(description = "JIRA-1235")
    @MethodOwner(owner = "cjwarner")
    public void getBranchTest() {
        GetBranchMethod apiBranch = new GetBranchMethod();
        apiBranch.expectResponseStatus(HttpResponseStatusType.OK_200);
        apiBranch.callAPI();
        apiBranch.validateResponse();
    }

    @Test(description = "JIRA-1236")
    @MethodOwner(owner = "cjwarner")
    public void renameBranchTest() {
        RenameBranchMethod apiBranch = new RenameBranchMethod();
        apiBranch.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        apiBranch.callAPI();
        apiBranch.validateResponse();
    }
}
