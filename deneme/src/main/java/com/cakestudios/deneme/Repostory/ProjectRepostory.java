package com.cakestudios.deneme.Repostory;

import com.cakestudios.deneme.dto.ProjectDto;
import com.cakestudios.deneme.entity.Project;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepostory extends JpaRepository<Project, Long> {

    Project getByProjectcode(String projectcode);

    List<Project> getByProjectcodeContains(String projectcode);

    Page<Project> findAll(Pageable pageable);

    List<Project> findAll(Sort sort);

    Project getByProjectcodeAndIdNot(String projectcode, Long id);


}
