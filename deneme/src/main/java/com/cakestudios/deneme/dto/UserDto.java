package com.cakestudios.deneme.dto;

import com.cakestudios.deneme.entity.IssureStatus;

import java.util.Date;

public class UserDto {
    private Long id;
    private String nameSurname;

    public UserDto() {
    }

    public UserDto(Long id, String nameSurname) {
        this.id = id;
        this.nameSurname = nameSurname;
    }
}
