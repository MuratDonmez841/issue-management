package com.cakestudios.deneme.service.impl;

import com.cakestudios.deneme.Repostory.IssueHistroyRepostory;
import com.cakestudios.deneme.entity.IssueHistory;
import com.cakestudios.deneme.service.IssueHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IssueHistroyServiceImpl implements IssueHistoryService {
    private final IssueHistroyRepostory issueHistroyRepostory;

    public IssueHistroyServiceImpl(IssueHistroyRepostory issueHistroyRepostory) {
        this.issueHistroyRepostory = issueHistroyRepostory;
    }

    @Override
    public IssueHistory save(IssueHistory issueHistory) {
        if (issueHistory.getDate()==null){
            throw new IllegalArgumentException("Issue date cannot be null!");
        }

        return null;
    }

    @Override
    public IssueHistory getById(Long id) {
        return issueHistroyRepostory.getOne(id);
    }

    @Override
    public Page<IssueHistory> getAllPageable(Pageable pageable) {
        return issueHistroyRepostory.findAll(pageable);
    }

    @Override
    public Boolean delete(IssueHistory issueHistory) {
        issueHistroyRepostory.delete(issueHistory);
        return Boolean.TRUE;
    }
}
