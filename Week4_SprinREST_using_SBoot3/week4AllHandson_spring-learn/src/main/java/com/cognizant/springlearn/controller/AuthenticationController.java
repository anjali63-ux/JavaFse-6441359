package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.AuthenticationRequest;
import com.cognizant.springlearn.model.AuthenticationResponse;
import com.cognizant.springlearn.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    // Endpoint for user authentication
    @PostMapping("/authenticate")
    public AuthenticationResponse createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        return authenticationService.createAuthenticationToken(authenticationRequest);
    }
}
