package com.softwareeng.universityapplication_ui.service.common;

import lombok.Data;

import java.util.Date;

@Data
public abstract class BaseModel {
    private Long id;
    private Date createdAt;
    private Date updatedAt;
}
