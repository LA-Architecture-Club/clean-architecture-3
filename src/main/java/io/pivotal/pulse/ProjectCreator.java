package io.pivotal.pulse;

import org.springframework.stereotype.Component;

@Component
public class ProjectCreator {

    private ProjectDAO projectDAO;

    public ProjectCreator(ProjectDAO projectDAO) {

        this.projectDAO = projectDAO;
    }

    public void create(String name, String code) {
        Project project = new Project(name, code);
        projectDAO.save(project);
    }
}
