package com.softwareeng.universityapplication_ui.service;

import com.softwareeng.universityapplication_ui.service.common.SoftDeletion;
import lombok.Data;

@Data
public class Hall extends SoftDeletion {
    private String name;

    private Double latitude;

    private Double longitude;

    private String description;
}
