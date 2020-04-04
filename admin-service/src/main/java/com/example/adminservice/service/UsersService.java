package com.example.adminservice.service;


import com.example.adminservice.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {
	UserDto createUser(UserDto userDetails);

}
