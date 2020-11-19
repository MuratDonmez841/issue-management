package com.cakestudios.deneme.service.impl;

import com.cakestudios.deneme.Repostory.ProjectRepostory;
import com.cakestudios.deneme.dto.ProjectDto;
import com.cakestudios.deneme.entity.Project;
import com.cakestudios.deneme.service.ProjectService;
import com.cakestudios.deneme.util.Tpage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepostory projectRepostory;
    private final ModelMapper modelMapper;

    public ProjectServiceImpl(ProjectRepostory projectRepostory, ModelMapper modelMapper) {
        this.projectRepostory = projectRepostory;
        this.modelMapper = modelMapper;
    }


    @Override
    public ProjectDto save(ProjectDto Project) {

        Project projectCheck = projectRepostory.getByProjectcode(Project.getProjectcode());
        if (projectCheck != null) {
            throw new IllegalArgumentException("Project code already exist!");
        }

        Project p = modelMapper.map(Project, Project.class);
        p = projectRepostory.save(p);
        Project.setId(p.getId());
        return Project;


    }

    @Override
    public ProjectDto getById(Long id) {
        Project p = projectRepostory.getOne(id);
        return modelMapper.map(p, ProjectDto.class);

    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Project getByProjectCode(String projectCode) {
        return null;
    }

    public Boolean delete(Long id) {
        try {
            projectRepostory.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new IllegalArgumentException("Project id not found!");
        }
    }

    @Override
    public Tpage<ProjectDto> getAllPageable(Pageable pageable) {
        Page<Project> data = projectRepostory.findAll(pageable);
        Tpage<ProjectDto> respnose = new Tpage<>();
        respnose.setStats(data, Arrays.asList(modelMapper.map(data.getContent(), ProjectDto.class)));
        return respnose;
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }

    @Override
    public ProjectDto update(Long id, ProjectDto projectDto) {
        Project projectDb = projectRepostory.getOne(id);
        if (projectDb == null) {
            throw new IllegalArgumentException("Project does not exist!" + id);
        }
        com.cakestudios.deneme.entity.Project projectCheck = projectRepostory.getByProjectcodeAndIdNot(projectDto.getProjectcode(), id);
        if (projectCheck != null) {
            throw new IllegalArgumentException("Project code already exist!");
        }

        projectDb.setProjectcode(projectDto.getProjectcode());
        projectDb.setProjectname(projectDto.getProjectname());

        projectRepostory.save(projectDb);
        return modelMapper.map(projectDb, ProjectDto.class);
    }
}
