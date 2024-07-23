package com.example.homework.netflix.controller;

import com.example.homework.netflix.model.User;
import jakarta.servlet.http.HttpServletRequest;
public abstract class AbstractController {
    static final String SESSION_ATTRIBUTE_USER = "user";
    User getUserFromSession(HttpServletRequest request) {
        return (User) request.getSession().getAttribute(SESSION_ATTRIBUTE_USER);
    }
}
