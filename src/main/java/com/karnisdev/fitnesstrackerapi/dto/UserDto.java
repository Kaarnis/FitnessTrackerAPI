package com.karnisdev.fitnesstrackerapi.dto;

import com.karnisdev.fitnesstrackerapi.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Integer userId;
    private String firstName;
    private String lastName;
    private String login;
    private String token;
    private Role role;
}
