package com.example.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Member {

    private String email;
    private String password;
    private String name;

    @Builder
    public Member(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }
}
