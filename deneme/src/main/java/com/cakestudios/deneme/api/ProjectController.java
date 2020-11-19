package com.cakestudios.deneme.api;

import com.cakestudios.deneme.dto.ProjectDto;
import com.cakestudios.deneme.service.impl.ProjectServiceImpl;
import com.cakestudios.deneme.util.ApiPaths;
import com.cakestudios.deneme.util.Tpage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiPaths.ProjectCtrl.CTRL)
@Api(value = "Project APIs")
@Slf4j
public class ProjectController {
    // http metodları post get put delete crud işlemleri**

    private final ProjectServiceImpl projectService;

    public ProjectController(ProjectServiceImpl projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/pagination")
    @ApiOperation(value = "Get by pagination operation", response = ProjectDto.class)
    public ResponseEntity<Tpage<ProjectDto>> getAllByPagination(Pageable pageable) {
        Tpage<ProjectDto> data =  projectService.getAllPageable(pageable);
        return ResponseEntity.ok(data);

    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get by id operation", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getByid(@PathVariable(value = "id", required = true) Long id) {
        // Log.info("Project Controller ->GetById -> Param: " + id);

        //    Log.debug("Project Controller ->GetById -> Param: " + id);

        ProjectDto projectDto = projectService.getById(id);
        return ResponseEntity.ok(projectDto);

    }

    @PostMapping
    @ApiOperation(value = "Post operation", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> createProject(@Validated @RequestBody ProjectDto projectDto) {
        return ResponseEntity.ok(projectService.save(projectDto));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update operation", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> updateProject(@PathVariable(value = "id", required = true) Long id, @Validated @RequestBody ProjectDto projectDto) {
        return ResponseEntity.ok(projectService.update(id, projectDto));

    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete operation", response = Boolean.class)
    public ResponseEntity<Boolean> deleteProject(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(projectService.delete(id));

    }

}
