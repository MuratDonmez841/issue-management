package com.cakestudios.deneme.service;

import com.cakestudios.deneme.dto.ProjectDto;
import com.cakestudios.deneme.entity.Project;
import com.cakestudios.deneme.util.Tpage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ProjectService {
    ProjectDto save(ProjectDto Project);

    ProjectDto getById(Long id);

    List<Project> getByProjectCodeContains(String projectCode);

    Project getByProjectCode(String projectCode);

    Tpage<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete(Project project);

    ProjectDto update(Long id, ProjectDto projectDto);
}
