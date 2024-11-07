package com.uujava.spring.demo.view;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.View;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class JsonView implements View {
    private final static ObjectMapper mapper = new ObjectMapper();

    @Override
    public String getContentType() {
        return MediaType.TEXT_HTML_VALUE;
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(mapper.writeValueAsBytes(model));
        outputStream.close();
    }
}
