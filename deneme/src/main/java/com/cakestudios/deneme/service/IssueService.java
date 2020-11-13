package com.cakestudios.deneme.service;

import com.cakestudios.deneme.dto.IssueDto;
import com.cakestudios.deneme.util.Tpage;
import org.springframework.data.domain.Pageable;


public interface IssueService {
    IssueDto save(IssueDto issueEntity);

    IssueDto getById(Long id);

    Tpage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issueEntity);
}
