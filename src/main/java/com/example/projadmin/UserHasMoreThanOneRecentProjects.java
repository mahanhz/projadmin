package com.example.projadmin;

import com.atlassian.jira.bc.project.ProjectAction;
import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.plugin.webfragment.conditions.AbstractWebCondition;
import com.atlassian.jira.plugin.webfragment.model.JiraHelper;
import com.atlassian.jira.project.Project;
import com.atlassian.jira.user.ApplicationUser;
import com.atlassian.jira.user.UserProjectHistoryManager;

import java.util.List;

public class UserHasMoreThanOneRecentProjects extends AbstractWebCondition {

    private final UserProjectHistoryManager userProjectHistoryManager;

    public UserHasMoreThanOneRecentProjects() {
        this.userProjectHistoryManager = ComponentAccessor.getComponentOfType(UserProjectHistoryManager.class);
    }

    @Override
    public boolean shouldDisplay(final ApplicationUser u, final JiraHelper jiraHelper) {
        final List<Project> projectHistory = userProjectHistoryManager.getProjectHistoryWithPermissionChecks(ProjectAction.VIEW_PROJECT, u);

        return u != null && projectHistory != null && projectHistory.size() > 1;
    }
}
