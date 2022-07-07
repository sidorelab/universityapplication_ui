package com.softwareeng.universityapplication_ui.service.impl;

import com.softwareeng.universityapplication_ui.service.UserService;
import com.softwareeng.universityapplication_ui.service.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {

    public UserServiceImpl() {
        super(User.class, User[].class);
    }

    @Override
    public ResponseEntity<User[]> getUsersEnrolledInACourse(Long idCourse) {
        return restCaller.getExchange(endpoint.getStudentsOfACourse() + "/" + idCourse, User[].class);
    }

    @Override
    public ResponseEntity<User[]> friendsOfLoggedUser(int pageNumber) {
        return restCaller.getExchange(endpoint.getFriendsOfLoggedUser() + "/" + pageNumber, User[].class);
    }

    @Override
    public ResponseEntity<User> loggedUser() {
        return restCaller.getExchange(endpoint.getLoggedUserProfile(), User.class);
    }
}
