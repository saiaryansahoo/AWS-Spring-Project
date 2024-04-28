package com.aryan.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
