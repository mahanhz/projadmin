package com.example.projadmin;

import com.atlassian.jira.plugin.webfragment.conditions.AbstractWebCondition;
import com.atlassian.jira.plugin.webfragment.model.JiraHelper;
import com.atlassian.jira.user.ApplicationUser;

public class UserLoggedInCondition2 extends AbstractWebCondition {

    @Override
    public boolean shouldDisplay(final ApplicationUser u, final JiraHelper jiraHelper) {
        return u != null;
    }
}
