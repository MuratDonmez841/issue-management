package com.cakestudios.deneme.dto;

import com.cakestudios.deneme.entity.IssureStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
@ApiModel(value = "IssueEntity Data Transfer Object")
public class IssueDto {
    @ApiModelProperty(value = "ID Of Issue")
    private Long id;
    @ApiModelProperty(value = "Description Of Issue")
    private String Description;
    @ApiModelProperty(value = "Details Of Issue")
    private String Details;
    @ApiModelProperty(value = "Date Of Issue")
    private Date date;
    @ApiModelProperty(value = "İssueStatus Of Issue")
    private IssureStatus issureStatus;
    @ApiModelProperty(value = "UserDto Of Issue")
    private UserDto userDto;
    @ApiModelProperty(value = "ProjectDto Of Issue")
    private ProjectDto project;


    public IssueDto() {
    }

    public IssueDto(Long id, String description, String details, Date date, IssureStatus issureStatus, UserDto userDto, ProjectDto project) {
        this.id = id;
        Description = description;
        Details = details;
        this.date = date;
        this.issureStatus = issureStatus;
        this.userDto = userDto;
        this.project = project;
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
