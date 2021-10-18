package com.company.website;

import com.company.Developer;
import com.company.ProjectManager;
import com.company.ProjectTeamFactory;
import com.company.Tester;

public class WebsiteTeamFactory  implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
