package com.cakestudios.deneme.api;


import com.cakestudios.deneme.dto.IssueDto;
import com.cakestudios.deneme.dto.ProjectDto;
import com.cakestudios.deneme.service.impl.IssueServiceImpl;
import com.cakestudios.deneme.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ApiPaths.IssueCtrl.CTRL)
@Api(value = "Issue APIs")
public class IssueController {
    // http metodları post get put delete crud işlemleri**

    private final IssueServiceImpl issueService;

    public IssueController(IssueServiceImpl issueService) {
        this.issueService = issueService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Get by id operation", response = IssueDto.class)
    public ResponseEntity<IssueDto> getByid(@PathVariable(value = "id" , required = true) Long id) {
        IssueDto issueDto = issueService.getById(id);
        return ResponseEntity.ok(issueDto);

    }

    @PostMapping
    @ApiOperation(value = "Create operation", response = IssueDto.class)
    public ResponseEntity<IssueDto> createIssue(@Validated @RequestBody IssueDto issueDto) {
        return ResponseEntity.ok(issueService.save(issueDto));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update by id operation", response = IssueDto.class)
    public ResponseEntity<IssueDto> updateIssue(@PathVariable(value = "id" , required = true) Long id, @Validated @RequestBody IssueDto issueDto) {
        return ResponseEntity.ok(issueService.update(id, issueDto));

    }
    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete operation", response = IssueDto.class)
    public ResponseEntity<Boolean> deleteIssue(@PathVariable(value = "id" , required = true) Long id){
        return ResponseEntity.ok(issueService.delete(id));

    }

}
