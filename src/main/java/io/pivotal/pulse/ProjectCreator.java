package io.pivotal.pulse;

import org.springframework.stereotype.Component;

@Component
public class ProjectCreator {

    private ProjectPersistance projectPersistance;

    public ProjectCreator(ProjectPersistance projectPersistance) {

        this.projectPersistance = projectPersistance;
    }

    public void create(String name, String code) {
        Project project = new Project(name, code);
        projectPersistance.save(project);
    }
}
