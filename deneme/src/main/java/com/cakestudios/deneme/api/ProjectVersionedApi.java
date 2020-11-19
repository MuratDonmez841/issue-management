package com.cakestudios.deneme.api;

import com.cakestudios.deneme.dto.ProjectDto;
import com.cakestudios.deneme.service.impl.ProjectServiceImpl;
import com.cakestudios.deneme.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/versioning")
@Api(value = "Project APIs")
public class ProjectVersionedApi {
    @Autowired
    ProjectServiceImpl projectService;
    @GetMapping(value = "/{id}",params = "version=1")
    @ApiOperation(value = "Get by id operation V1", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getByidV1(@PathVariable(value = "id", required = true) Long id) {
        ProjectDto projectDto = projectService.getById(id);
        return ResponseEntity.ok(projectDto);

    }
    @GetMapping(value = "/{id}",params = "version=2")
    @ApiOperation(value = "Get by id operation V2", response = ProjectDto.class)
    public ResponseEntity<ProjectDto> getByidV2(@PathVariable(value = "id", required = true) Long id) {
        ProjectDto projectDto = projectService.getById(id);
        return ResponseEntity.ok(projectDto);

    }

}
