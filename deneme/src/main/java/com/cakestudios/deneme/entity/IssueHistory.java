package com.cakestudios.deneme.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
@Table(name = "issue_history")
@Entity
public class IssueHistory extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JoinColumn(name = "issue_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private IssueEntity issueEntity;
    @JoinColumn(name = "assignee_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private User assignee;
    @Column(name = "issue_history_date")
    private Date date;



    public IssueHistory() {
    }

    public IssueHistory(Long id, IssueEntity issueEntity, User assignee, Date date) {
        this.id = id;
        this.issueEntity = issueEntity;
        this.assignee = assignee;
        this.date = date;
    }

    @Override
    public String toString() {
        return "IssueHistory{" +
                "id=" + id +
                ", issueEntity=" + issueEntity +
                ", assignee=" + assignee +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IssueHistory that = (IssueHistory) o;
        return id == that.id &&
                Objects.equals(issueEntity, that.issueEntity) &&
                Objects.equals(assignee, that.assignee) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, issueEntity, assignee, date);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IssueEntity getIssueEntity() {
        return issueEntity;
    }

    public void setIssueEntity(IssueEntity issueEntity) {
        this.issueEntity = issueEntity;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }
}
