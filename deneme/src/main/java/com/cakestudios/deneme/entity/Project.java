package com.cakestudios.deneme.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "project")
public class Project extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "project_code", unique = true)
    private String projectcode;
    @Column(name = "project_name", length = 1000)
    private String progectname;
    @JoinColumn(name = "user_manager_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User manager;

    public Project() {
    }

    public Project(Long id, String projectcode, String progectname, User manager) {
        this.id = id;
        this.projectcode = projectcode;
        this.progectname = progectname;
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectcode='" + projectcode + '\'' +
                ", progectname='" + progectname + '\'' +
                ", manager=" + manager +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return id == project.id &&
                Objects.equals(projectcode, project.projectcode) &&
                Objects.equals(progectname, project.progectname) &&
                Objects.equals(manager, project.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectcode, progectname, manager);
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectcode() {
        return projectcode;
    }

    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode;
    }

    public String getProgectname() {
        return progectname;
    }

    public void setProgectname(String progectname) {
        this.progectname = progectname;
    }
}
