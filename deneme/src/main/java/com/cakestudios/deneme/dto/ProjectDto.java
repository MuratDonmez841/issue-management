package com.cakestudios.deneme.dto;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "Project Data Transfer Object")
public class ProjectDto {
    @ApiModelProperty(value = "ID Of Project")
    private Long id;
    @NotNull
    @ApiModelProperty(required = true,value = "Name Of Project")
    private String projectname;
    @NotNull
    @ApiModelProperty(required = true,value = "Code Of Project")
    private String projectcode;

    public ProjectDto(Long id) {
        this.id = id;
    }

    public ProjectDto() {
    }

    public ProjectDto(Long id, String projectname, String projectcode) {
        this.id = id;
        this.projectname = projectname;
        this.projectcode = projectcode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getProjectcode() {
        return projectcode;
    }

    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode;
    }
}
