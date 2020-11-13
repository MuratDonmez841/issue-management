package com.cakestudios.deneme.service.impl;

import com.cakestudios.deneme.Repostory.IssueRepostory;
import com.cakestudios.deneme.dto.IssueDto;
import com.cakestudios.deneme.entity.IssueEntity;
import com.cakestudios.deneme.service.IssueService;
import com.cakestudios.deneme.util.Tpage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {

    private final IssueRepostory issueRepostory;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepostory issueRepostory, ModelMapper modelMapper) {
        this.issueRepostory = issueRepostory;
        this.modelMapper = modelMapper;
    }


    @Override
    public IssueDto save(IssueDto issueEntity) {
        if (issueEntity.getDate() == null) {
            throw new IllegalArgumentException("Issue date connot be null");
        }
        IssueEntity issueEntitydb = modelMapper.map(issueEntity, IssueEntity.class);
        issueEntitydb = issueRepostory.save(issueEntitydb);
        return modelMapper.map(issueEntitydb, IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public Tpage<IssueDto> getAllPageable(Pageable pageable) {
        Page<IssueEntity> data = issueRepostory.findAll(pageable);
        Tpage<IssueDto> page = new Tpage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(data.getContent(), IssueDto[].class);
        page.setStats(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(IssueDto issueEntity) {
        return null;
    }
}
