package com.cakestudios.deneme.service.impl;

import com.cakestudios.deneme.Repostory.UserRepostory;
import com.cakestudios.deneme.entity.User;
import com.cakestudios.deneme.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class UserSeviceImpl implements UserService {
    private final UserRepostory userRepostory;

    public UserSeviceImpl(UserRepostory userRepostory) {
        this.userRepostory = userRepostory;
    }


    @Override
    public User save(User user) {
        if (user.getUsername()==null){
            throw new IllegalArgumentException("User name cannot bee null!");
        }
        if (user.getEmail()==null){
            throw new IllegalArgumentException("User email cannot bee null!");
        }
        return userRepostory.save(user);
    }

    @Override
    public User getById(Long id) {
        return userRepostory.getOne(id);
    }

    @Override
    public Page<User> getAllPageable(Pageable pageable) {
        return userRepostory.findAll(pageable);
    }

    @Override
    public User getByUserName(String username) {
        return userRepostory.findByUsername(username);
    }
}
