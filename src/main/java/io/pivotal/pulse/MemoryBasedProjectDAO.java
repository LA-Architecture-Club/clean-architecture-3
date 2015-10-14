package io.pivotal.pulse;

import java.util.HashMap;
import java.util.Map;

public class MemoryBasedProjectDAO implements ProjectDAO {
    private Map<Integer, Project> projects = new HashMap<>();
    Integer idSeq = 0;

    @Override
    public void save(Project project){
        throw new Exception("Implemenet me");
        project.setId(idSeq ++);
        projects.put(project.getId(), project);
    }

    @Override
    public Project find(Integer id) {
        return projects.get(id);
    }
}
