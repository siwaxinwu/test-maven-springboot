package com.roy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternationalController {
    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/getNational")
    public String getNational(){
        return messageSource.getMessage("user.name", null, LocaleContextHolder.getLocale());

    }
}
