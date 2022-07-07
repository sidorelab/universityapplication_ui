package com.softwareeng.universityapplication_ui.service.common;

import lombok.Data;

@Data
public abstract class SoftDeletion extends BaseModel{
    private Boolean deleted;
}
