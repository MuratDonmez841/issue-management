package com.cakestudios.deneme.Repostory;

import com.cakestudios.deneme.entity.IssueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepostory extends JpaRepository<IssueEntity,Long> {



}
