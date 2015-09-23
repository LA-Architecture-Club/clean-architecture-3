package io.pivotal.pulse;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ProjectCreatorTest {

    private ProjectCreator subject;
    private ProjectDAO projectDAO;

    @Before
    public void setUp() {
        projectDAO = mock(ProjectDAO.class);
        subject = new ProjectCreator(projectDAO);

    }
    @Test
    public void create_persistsProject() throws Exception {
        subject.create("Project A", "ABC");

        verify(projectDAO).save(new Project("Project A", "ABC"));
    }
}