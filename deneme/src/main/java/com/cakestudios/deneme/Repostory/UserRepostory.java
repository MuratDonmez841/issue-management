package com.cakestudios.deneme.Repostory;

import com.cakestudios.deneme.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepostory extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
