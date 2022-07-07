package com.softwareeng.universityapplication_ui.service;

import org.springframework.http.ResponseEntity;


public interface UserService extends BaseService<User, Long> {
    ResponseEntity<User[]> getUsersEnrolledInACourse(Long idCourse);

    ResponseEntity<User[]> friendsOfLoggedUser(int pageNumber);

    ResponseEntity<User> loggedUser();

}
