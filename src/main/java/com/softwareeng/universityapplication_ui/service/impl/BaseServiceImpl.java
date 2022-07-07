package com.softwareeng.universityapplication_ui.service.impl;

import com.softwareeng.universityapplication_ui.service.Endpoint;
import com.softwareeng.universityapplication_ui.service.BaseService;
import com.softwareeng.universityapplication_ui.service.RestCaller;
import com.softwareeng.universityapplication_ui.service.common.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;

public abstract class BaseServiceImpl<MODEL extends BaseModel, ID> implements BaseService<MODEL, ID> {

    @Autowired
    protected RestCaller restCaller;

    @Autowired
    protected Endpoint endpoint;

    private Class<MODEL> classOfModel;
    private Class<MODEL[]> classOfArrayModel;

    public BaseServiceImpl(Class<MODEL> classOfModel, Class<MODEL[]> classOfArrayModel) {
        this.classOfModel = classOfModel;
        this.classOfArrayModel = classOfArrayModel;
    }

    @Override
    public ResponseEntity<MODEL> findById(ID id) {
        return restCaller.getExchange("/" + classOfModel.getSimpleName().toLowerCase() + "/" + id, classOfModel);
    }

    @Override
    public ResponseEntity<Void> save(MODEL model) {
        return restCaller.postExchange("/" + classOfModel.getSimpleName().toLowerCase(), new HttpEntity<>(model), Void.class);
    }

    @Override
    public ResponseEntity<MODEL[]> findAllPageable(int pageNumber) {
        return restCaller.getExchange("/" + classOfModel.getSimpleName().toLowerCase() + "/" + pageNumber, classOfArrayModel);
    }
}
