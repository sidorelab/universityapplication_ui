package com.softwareeng.universityapplication_ui.service;

public interface MessageUtil {
    String getMessage(String code);

    String getMessageWithParams(String code, Object[] params);
}
