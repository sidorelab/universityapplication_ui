package com.softwareeng.universityapplication_ui.service;

import com.softwareeng.universityapplication_ui.service.common.BaseModel;
import org.springframework.http.ResponseEntity;

public interface BaseService<MODEL extends BaseModel, ID> {
    ResponseEntity<MODEL> findById(ID id);

    ResponseEntity<Void> save(MODEL model);

    ResponseEntity<MODEL[]> findAllPageable(int pageNumber);
}
