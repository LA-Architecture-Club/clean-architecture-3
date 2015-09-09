package io.pivotal.pulse;

public class Project {

    private String name;
    private String code;

    public Project(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (code != null ? !code.equals(project.code) : project.code != null) return false;
        if (name != null ? !name.equals(project.name) : project.name != null) return false;

        return true;
    }
}
