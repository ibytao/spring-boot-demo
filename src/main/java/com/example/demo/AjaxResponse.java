package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AjaxResponse {
    private int code;
    private String message;
    private Object data;

    public static AjaxResponse success(Object data) {
        return new AjaxResponse(200, "", data);
    }

    public static AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("成功");
        return ajaxResponse;
    }
}
