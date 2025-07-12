package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.AuthenticationRequest;
import com.cognizant.springlearn.model.AuthenticationResponse;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AuthenticationService {

    private static final String SECRET_KEY = "secret";  // A secret key for signing the JWT

    // Method to generate JWT token after validating the user
    public AuthenticationResponse createAuthenticationToken(AuthenticationRequest authenticationRequest) throws Exception {
        // Here we should normally validate the user (e.g., check credentials in the database)
        if ("user".equals(authenticationRequest.getUsername()) && "pwd".equals(authenticationRequest.getPassword())) {
            String token = Jwts.builder()
                    .setSubject(authenticationRequest.getUsername())
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))  // Set expiry time (1 hour)
                    .signWith(SignatureAlgorithm.HS256, SECRET_KEY)  // Use HS256 algorithm to sign the token
                    .compact();
            return new AuthenticationResponse(token);
        } else {
            throw new Exception("Invalid credentials");
        }
    }
}
