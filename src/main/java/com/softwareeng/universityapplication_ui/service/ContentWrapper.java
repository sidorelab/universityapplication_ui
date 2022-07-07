package com.softwareeng.universityapplication_ui.service;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ContentWrapper {

    @NotEmpty
    private String content;
}
