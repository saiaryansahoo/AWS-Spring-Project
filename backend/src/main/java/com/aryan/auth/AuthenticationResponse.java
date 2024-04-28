package com.aryan.auth;

import com.aryan.customer.CustomerDTO;

public record AuthenticationResponse (
        String token,
        CustomerDTO customerDTO){
}
