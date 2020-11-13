package com.cakestudios.deneme.service;

import com.cakestudios.deneme.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ProjectService {
    Project save(Project Project);

    Project getById(Long id);

    List<Project> getByProjectCodeContains(String projectCode);

    List<Project> getByProjectCode(String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete(Project project);
}
