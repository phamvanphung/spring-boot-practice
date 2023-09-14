package com.example.demo.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER")

    ;

    private final String role;

    Role(String role){
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }

}
