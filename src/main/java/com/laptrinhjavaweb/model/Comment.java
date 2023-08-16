package com.laptrinhjavaweb.model;

import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.Timestamp;

public class Comment {

    private String id;
    private String parent;
    private Timestamp created;
    private Timestamp modified;
    private String content;

    public static void main(String[] args) {
        BCryptPasswordEncoder E = new BCryptPasswordEncoder();
        System.out.println(E.encode("123456").compareTo(E.encode("123456")));

        PasswordEncoder p = new BCryptPasswordEncoder();
        System.out.println(p.encode("123456"));
    }

}
