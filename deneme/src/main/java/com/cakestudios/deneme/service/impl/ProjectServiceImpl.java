package com.cakestudios.deneme.service.impl;

import com.cakestudios.deneme.Repostory.ProjectRepostory;
import com.cakestudios.deneme.entity.Project;
import com.cakestudios.deneme.service.ProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService{

    private final ProjectRepostory projectRepostory;

    public ProjectServiceImpl(ProjectRepostory projectRepostory) {
        this.projectRepostory = projectRepostory;
    }

    @Override
    public Project save(Project Project) {
        if (Project.getProjectcode()==null){
            throw new IllegalArgumentException("Project code cannot be null");
        }

        return projectRepostory.save(Project);
    }

    @Override
    public Project getById(Long id) {
        return projectRepostory.getOne(id);
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return projectRepostory.findAll(pageable);
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }
}
