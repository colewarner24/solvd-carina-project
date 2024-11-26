package com.zebrunner.carina.demo.api.github.methods.issue;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.utils.config.Configuration;

import java.util.HashMap;
import java.util.Map;

public class DeleteIssueGraphQLMethod extends AbstractApiMethodV2 {

    public DeleteIssueGraphQLMethod(String issueId, String clientMutationId) {
        super(null, "api/github/issue/_delete/rs.json", "api/github/issue/_delete/delete_issue.properties");

        request.header("Authorization", "Bearer " + Configuration.getRequired("github_token"));
        // Set the GraphQL query in the request body
        String query = "mutation { deleteIssue(input: {issueId: \\\"" + issueId + "\\\", clientMutationId: \\\"" + clientMutationId + "\\\"}) { clientMutationId } }";
        Map<String, Object> payload = new HashMap<>();
        payload.put("query", query);

        setRequestBody(payload);
    }
}