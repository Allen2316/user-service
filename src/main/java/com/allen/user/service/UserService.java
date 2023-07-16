package com.allen.user.service;

import com.allen.user.domain.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto getById(long id);
    List<UserDto> getAll();



}
