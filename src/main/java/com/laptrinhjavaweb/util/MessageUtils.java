package com.laptrinhjavaweb.util;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Component
public class MessageUtils {
    public Map<String, String> getMessage(HttpServletRequest request) {
        Map<String, String> result = new HashMap<>();
        if(request.getParameter("message") != null) {
            if(request.getParameter("message").equals("update_success")) {
                result.put("message", "Update success");
                result.put("alert","success");
            } else if(request.getParameter("message").equals("insert_success")) {
                result.put("message", "Insert success");
                result.put("alert","success");
            } else if(request.getParameter("message").equals("delete_success")) {
                result.put("message", "Delete success");
                result.put("alert","success");
            }
            else if(request.getParameter("message").equals("error_system")) {
                result.put("message", "Error system");
                result.put("alert","danger");
            }
        }
        return result;
    }
}
