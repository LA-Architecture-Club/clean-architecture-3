package io.pivotal.pulse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ProjectController {

    @RequestMapping(value = "/project", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void create() {

    }
}
