package com.company.website;

import com.company.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages websote project....");
    }
}
