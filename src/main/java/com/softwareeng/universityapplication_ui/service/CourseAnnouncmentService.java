package com.softwareeng.universityapplication_ui.service;

import com.softwareeng.universityapplication_ui.service.commentableAndLikeable.Announcment;
import org.springframework.http.ResponseEntity;

public interface CourseAnnouncmentService extends BaseService<Announcment, Long> {

    ResponseEntity<Announcment[]> getCourseAnnouncmentsOfACourse(Long idCourse);
}
