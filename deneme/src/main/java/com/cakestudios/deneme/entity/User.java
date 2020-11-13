package com.cakestudios.deneme.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "uname", length = 100, unique = true)
    private String username;
    @Column(name = "pwd", length = 200)
    private String password;
    @Column(name = "name_surname", length = 200)
    private String nameSurname;
    @Column(name = "email", length = 100)
    private String email;
    @JoinColumn(name = "asignee_user_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<IssueEntity> issueEntities;

    public User() {
    }

    public User(Long id, String username, String password, String nameSurname, String email, List<IssueEntity> issueEntities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nameSurname = nameSurname;
        this.email = email;
        this.issueEntities = issueEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(nameSurname, user.nameSurname) &&
                Objects.equals(email, user.email) &&
                Objects.equals(issueEntities, user.issueEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, nameSurname, email, issueEntities);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nameSurname='" + nameSurname + '\'' +
                ", email='" + email + '\'' +
                ", issueEntities=" + issueEntities +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<IssueEntity> getIssueEntities() {
        return issueEntities;
    }

    public void setIssueEntities(List<IssueEntity> issueEntities) {
        this.issueEntities = issueEntities;
    }
}
