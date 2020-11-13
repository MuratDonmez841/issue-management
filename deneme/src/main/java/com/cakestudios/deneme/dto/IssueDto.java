package com.cakestudios.deneme.dto;

import com.cakestudios.deneme.entity.IssureStatus;

import java.util.Date;

public class IssueDto {
    private Long id;
    private String Description;
    private String Details;
    private Date date;
    private IssureStatus issureStatus;
    private UserDto userDto;
    private ProjectDto project;

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

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
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

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public ProjectDto getProject() {
        return project;
    }

    public void setProject(ProjectDto project) {
        this.project = project;
    }
}
