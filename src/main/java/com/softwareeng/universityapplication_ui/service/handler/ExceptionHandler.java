package com.softwareeng.universityapplication_ui.service.handler;

import com.softwareeng.universityapplication_ui.service.beException.HttpErrorResponse;
import com.softwareeng.universityapplication_ui.service.MessageUtil;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class ExceptionHandler {

    @Autowired
    private MessageUtil messageUtil;

    @org.springframework.web.bind.annotation.ExceptionHandler(HttpStatusCodeException.class)
    public ModelAndView handleServiceExceptions(HttpStatusCodeException exception, HttpServletRequest request) {
        log.error("Exception from BE: " + exception);
        String responseBody = exception.getResponseBodyAsString();
        Gson g = new Gson();
        HttpErrorResponse httpErrorResponse = g.fromJson(responseBody, HttpErrorResponse.class);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exceptionMessage", messageUtil.getMessage(httpErrorResponse.getLocalizedMessage()));

        modelAndView.setViewName("error");
        return modelAndView;
    }
}