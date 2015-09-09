package io.pivotal.pulse;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ProjectControllerTest {
    private ProjectController projectController;
    private ProjectCreator projectCreator;

    @Before
    public void setUp() {
        projectCreator = mock(ProjectCreator.class);
        projectController = new ProjectController(projectCreator);
    }

    @Test
    public void create_shouldInvokeTheProjectCreatorWithGivenProjectDto() throws Exception {
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setName("Project Name");
        projectDTO.setCode("Code");
        projectController.create(projectDTO);

        verify(projectCreator).create("Project Name", "Code");
    }
}