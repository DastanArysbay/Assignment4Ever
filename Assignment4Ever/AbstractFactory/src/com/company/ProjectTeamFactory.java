package com.company;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
