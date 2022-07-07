package com.softwareeng.universityapplication_ui.service;

import com.softwareeng.universityapplication_ui.service.commentableAndLikeable.Course;
import org.springframework.http.ResponseEntity;

public interface CourseService extends BaseService<Course, Long> {
    ResponseEntity<Course[]> getAllAvailableCourses(int pageNumber);

    ResponseEntity<Course[]> getAllEnrolledCourses(int pageNumber);

    ResponseEntity<Void> enrollInACourse(Long idCourse);

    ResponseEntity<Void> dropACourse(Long idCourse);

    ResponseEntity<Course[]> getCoursesOfAFriend(Long idFriend, int pageNumber);
}
