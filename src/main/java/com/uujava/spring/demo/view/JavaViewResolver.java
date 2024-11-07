package com.uujava.spring.demo.view;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

public class JavaViewResolver implements ViewResolver {
    @Override
    public View resolveViewName(String viewName, Locale locale) {
        return new JsonView();
    }
}
