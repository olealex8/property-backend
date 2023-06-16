package com.dev.craniumproperty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.craniumproperty.dto.SignupDTO;
import com.dev.craniumproperty.dto.UserDTO;
import com.dev.craniumproperty.service.AuthService;

@RestController
public class SignupController {

    @Autowired
    private AuthService authService;

    @PostMapping("/sign-up")
    public ResponseEntity<?> signupUser(@RequestBody SignupDTO signupDTO) {
       UserDTO createdUser = authService.createUser(signupDTO);
       if (createdUser == null){
           return new ResponseEntity<>("User not created..", HttpStatus.BAD_REQUEST);
       }
       return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

}

