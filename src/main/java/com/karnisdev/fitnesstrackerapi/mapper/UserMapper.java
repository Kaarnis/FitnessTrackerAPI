package com.karnisdev.fitnesstrackerapi.mapper;

import com.karnisdev.fitnesstrackerapi.dto.SignUpDto;
import com.karnisdev.fitnesstrackerapi.dto.UserDto;
import com.karnisdev.fitnesstrackerapi.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}