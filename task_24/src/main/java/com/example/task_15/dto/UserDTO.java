package com.example.task_15.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {
    private String name;
    private String password;
    private String email;
    private String roles;
}
