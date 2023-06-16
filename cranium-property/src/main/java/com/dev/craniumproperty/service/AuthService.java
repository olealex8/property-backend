package com.dev.craniumproperty.service;

import com.dev.craniumproperty.dto.SignupDTO;
import com.dev.craniumproperty.dto.UserDTO;

public interface AuthService {

    UserDTO createUser(SignupDTO signupDTO);
    
}
