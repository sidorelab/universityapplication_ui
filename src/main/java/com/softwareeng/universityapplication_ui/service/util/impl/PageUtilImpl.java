package com.softwareeng.universityapplication_ui.service.util.impl;

import com.softwareeng.universityapplication_ui.service.util.PageUtil;
import org.springframework.stereotype.Component;

@Component
public class PageUtilImpl implements PageUtil {

    @Override
    public <T> String getContextPage(Class<T> clazz) {
        String classSimpleName = clazz.getSimpleName();
        return classSimpleName.replace("Controller", "").toLowerCase();
    }

    @Override
    public <T> String getAddPage(Class<T> clazz) {
        return (getContextPage(clazz) + "/add-" + getContextPage(clazz)).toLowerCase();
    }
}
