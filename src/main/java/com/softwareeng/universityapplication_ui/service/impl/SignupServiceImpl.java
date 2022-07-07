package com.softwareeng.universityapplication_ui.service.impl;

import com.softwareeng.universityapplication_ui.service.Endpoint;
import com.softwareeng.universityapplication_ui.service.SignupService;
import com.softwareeng.universityapplication_ui.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

@Service
public class SignupServiceImpl implements SignupService {

    @Autowired
    private RestOperations restOperations;

    @Autowired
    private Endpoint endpoint;

    @Override
    public void signup(User user) {
        restOperations.exchange(endpoint.getRemoteRootUri() + endpoint.getSignup(), HttpMethod.POST, new HttpEntity<>(user), Void.class);
    }
}
