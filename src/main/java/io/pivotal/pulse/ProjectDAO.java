package io.pivotal.pulse;

public interface ProjectDAO {
    void save(Project project);

    Project find(Integer id);
}
