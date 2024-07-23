package com.example.homework.netflix.controller;

import com.example.homework.netflix.model.User;
import javax.servlet.http.HttpServletRequest;
public abstract class AbstractController {
    static final String SESSION_ATTRIBUTE_USER = "user";
    static User getUserFromSession(jakarta.servlet.http.HttpServletRequest request) {
        return (User) request.getSession().getAttribute(SESSION_ATTRIBUTE_USER);
    }
}
