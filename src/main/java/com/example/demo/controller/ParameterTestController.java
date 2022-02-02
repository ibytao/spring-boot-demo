package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ParameterTestController
 */
@RestController
public class ParameterTestController {

    @GetMapping("/car/{id}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id, @PathVariable Map<String, String> pv,
            @RequestHeader("user-agent") String userAgent, @RequestHeader Map<String, String> header,
            @RequestParam("inters") List<String> inters, @RequestParam Map<String, String> params,
            @CookieValue("sessionId") String sessionId, @CookieValue("sessionId") Cookie cookie) {
        Map<String, Object> map = new HashMap<>();
        // map.put("id", id);
        // map.put("pv", pv);
        // map.put("userAgent", userAgent);
        // map.put("header", header);
        map.put("inters", inters);
        map.put("params", params);
        map.put("sessionId", sessionId);
        System.out.println(cookie.getName() + ": " + cookie.getValue());
        return map;
    }
}
