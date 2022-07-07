package com.softwareeng.universityapplication_ui.service.util;

public interface PageUtil {
    <T> String getContextPage(Class<T> clazz);

    <T> String getAddPage(Class<T> clazz);
}
