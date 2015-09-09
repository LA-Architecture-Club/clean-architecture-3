package io.pivotal.pulse;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ProjectCreatorTest {

    private ProjectCreator subject;
    private ProjectPersistance projectPersistance;

    @Before
    public void setUp() {
        projectPersistance = mock(ProjectPersistance.class);
        subject = new ProjectCreator(projectPersistance);

    }
    @Test
    public void create_persistsProject() throws Exception {
        subject.create("Project A", "ABC");

        verify(projectPersistance).save(new Project("Project A", "ABC"));
    }
}