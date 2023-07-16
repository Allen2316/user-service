package com.allen.user.domain.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String firstName;
    private String lastName;

    @NotEmpty(message = "El userName no puede ser nulo o vacío")
    private String userName;
    @NotEmpty(message = "El Password no puede ser nulo o vacío")
    private String password;
}
