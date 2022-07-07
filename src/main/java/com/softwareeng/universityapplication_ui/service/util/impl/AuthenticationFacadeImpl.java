package com.softwareeng.universityapplication_ui.service.util.impl;

import com.softwareeng.universityapplication_ui.service.util.AuthenticationFacade;
import com.softwareeng.universityapplication_ui.service.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFacadeImpl implements AuthenticationFacade {
    @Override
    public User getAuthenticatedUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    @Override
    public String getToken() {
        return getAuthenticatedUser().getToken();
    }
}
