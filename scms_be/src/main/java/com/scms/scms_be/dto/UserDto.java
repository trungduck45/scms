package com.scms.scms_be.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.scms.scms_be.entity.Users;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class UserDto {
    
    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;

    private String name;
    private String email;
    private String city;
    private String password;
    private String role;
    
    
    private String company;
    private String location;
    private String otp;
    
    private Users ourUsers;
    private List<Users> ourUsersList;
  



}
