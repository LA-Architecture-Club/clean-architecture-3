package io.pivotal.pulse;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProjectDAOTest {

    ProjectDAO projectDAO = new MemoryBasedProjectDAO();
    private Project project1;
    private Project project2;

    @Before
    public void setUp() throws Exception {
        project1 = new Project("foo", "bar");
        project2 = new Project("baz", "qux");
    }

    @Test
    public void save_shouldSaveAndFind() throws Exception {
        projectDAO.save(project1);
        assertEquals(project1, projectDAO.find(project1.getId()));
    }

    @Test
    public void save_shouldFindFirstSave() throws Exception {
        projectDAO.save(project1);
        projectDAO.save(project2);
        assertEquals(project1, projectDAO.find(project1.getId()));
    }


    @Test
    public void save_shouldLogErrorIfProjectHasAlreadyAnId() throws Exception {
        throw new Exception("Implement me");
    }

    @Test
    public void update_shouldUpdateTheExistingField() throws Exception {
        throw new Exception("Implement me");
    }
}
