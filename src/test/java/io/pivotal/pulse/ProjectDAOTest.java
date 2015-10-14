package io.pivotal.pulse;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ProjectDAOTest {

    ProjectDAO projectDAO = new MemoryBasedProjectDAO();
    private Project project1;

    @Before
    public void setUp() throws Exception {
        project1 = new Project("foo", "bar");
    }

    @Test
    public void save_shouldSave() throws Exception {
        projectDAO.save(project1);
        assertEquals(project1, projectDAO.find(project1.getId()));
    }

    @Test
    public void find_shouldFindTheRightProject() throws Exception {
        Project nonExistingProject = projectDAO.find(project1.getId());
        assertNull(nonExistingProject);
        projectDAO.save(project1);
        Project foundProject = projectDAO.find(project1.getId());
        assertEquals(project1, foundProject);
    }


    @Test
    public void save_shouldUpdate_ifTheProjectExists() throws Exception {
        projectDAO.save(project1);
        Integer initialId = project1.getId();
        project1.setName("newName");
        projectDAO.save(project1);
        assertEquals(initialId, project1.getId());
        assertEquals(project1.getName(), "newName");
    }

    @Test
    public void update_shouldUpdateTheExistingField() throws Exception {

    }
}
