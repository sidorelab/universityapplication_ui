package com.softwareeng.universityapplication_ui.service.impl;

import com.softwareeng.universityapplication_ui.service.CourseAnnouncmentService;
import com.softwareeng.universityapplication_ui.service.commentableAndLikeable.Announcment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CourseAnnouncmentServiceImpl extends BaseServiceImpl<Announcment, Long> implements CourseAnnouncmentService {
    public CourseAnnouncmentServiceImpl() {
        super(Announcment.class, Announcment[].class);
    }

    @Override
    public ResponseEntity<Announcment[]> getCourseAnnouncmentsOfACourse(Long idCourse) {
        return this.restCaller.getExchange(endpoint.getAnnouncementsForACourse() + "/" + idCourse, Announcment[].class);
    }
}
