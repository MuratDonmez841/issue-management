package com.cakestudios.deneme.Repostory;

import com.cakestudios.deneme.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueHistroyRepostory extends JpaRepository<IssueHistory,Long> {



}
