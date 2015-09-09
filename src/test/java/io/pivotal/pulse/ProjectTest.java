package io.pivotal.pulse;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProjectTest {

    @Test
    public void equals_returnsTrueWhenObjectsHaveTheSameNameAndCode() throws Exception {
        Project projectA = new Project("A", "ABC");
        Project projectB = new Project("A", "ABC");
        assertThat(projectA, is(equalTo(projectB)));
    }

    @Test
    public void equals_returnsFalseWhenObjectsHaveDifferentNameOrCode() throws Exception {
        Project projectA = new Project("A", "DEF");
        Project projectB = new Project("B", "ABC");
        assertThat(projectA, is(equalTo(projectB)));

    }
}