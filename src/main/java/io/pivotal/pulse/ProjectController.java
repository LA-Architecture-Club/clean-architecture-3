package io.pivotal.pulse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ProjectController {
    private ProjectCreator projectCreator;

    @Autowired
    public ProjectController(ProjectCreator projectCreator) {

        this.projectCreator = projectCreator;
    }

    @RequestMapping(value = "/projects", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody ProjectDTO projectDto) throws Exception {
        projectCreator.create(projectDto.getName(), projectDto.getCode());
    }
}
