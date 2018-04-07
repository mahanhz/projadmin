package com.example.projadmin;

import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.plugin.webfragment.conditions.AbstractWebCondition;
import com.atlassian.jira.plugin.webfragment.model.JiraHelper;
import com.atlassian.jira.user.ApplicationUser;

public class UserIsAdminCondition2 extends AbstractWebCondition {

    @Override
    public boolean shouldDisplay(final ApplicationUser u, final JiraHelper jiraHelper) {
        return u != null && ComponentAccessor.getUserUtil().getJiraAdministrators().contains(u);
    }
}
