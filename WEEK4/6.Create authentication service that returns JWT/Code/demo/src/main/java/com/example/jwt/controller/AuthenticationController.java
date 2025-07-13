package com.example.jwt.controller;

import com.example.jwt.util.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.Base64;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Creds = authHeader.substring("Basic ".length());
            byte[] decodedCreds = Base64.getDecoder().decode(base64Creds);
            String[] creds = new String(decodedCreds).split(":", 2);

            String username = creds[0];
            String password = creds[1];

            if ("user".equals(username) && "pwd".equals(password)) {
                String token = jwtUtil.generateToken(username);
                return ResponseEntity.ok("{\"token\":\"" + token + "\"}");
            }
        }

        return ResponseEntity.status(401).body("Unauthorized");
    }

}