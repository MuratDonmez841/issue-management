package com.cakestudios.deneme.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "issue")
public class IssueEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "description", length = 400)
    private String Description;
    @Column(name = "details", length = 4000)
    private String Details;
    @Column(name = "date")
    private Date date;
    @Column(name = "issure_status")
    @Enumerated(EnumType.STRING)
    private IssureStatus issureStatus;

    @JoinColumn(name = "asignee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;
    @JoinColumn(name = "project_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Project project;


    public IssueEntity() {

    }

    public IssueEntity(Long id, String description, String details, Date date, IssureStatus issureStatus, User assignee, Project project) {
        this.id = id;
        Description = description;
        Details = details;
        this.date = date;
        this.issureStatus = issureStatus;
        this.assignee = assignee;
        this.project = project;
    }

    @Override
    public String toString() {
        return "IssueEntity{" +
                "id=" + id +
                ", Description='" + Description + '\'' +
                ", Details='" + Details + '\'' +
                ", date=" + date +
                ", issureStatus=" + issureStatus +
                ", assignee=" + assignee +
                ", project=" + project +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IssueEntity that = (IssueEntity) o;
        return id == that.id &&
                Objects.equals(Description, that.Description) &&
                Objects.equals(Details, that.Details) &&
                Objects.equals(date, that.date) &&
                issureStatus == that.issureStatus &&
                Objects.equals(assignee, that.assignee) &&
                Objects.equals(project, that.project);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Description, Details, date, issureStatus, assignee, project);
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public IssureStatus getIssureStatus() {
        return issureStatus;
    }

    public void setIssureStatus(IssureStatus issureStatus) {
        this.issureStatus = issureStatus;
    }
}
