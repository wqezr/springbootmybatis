package com.mayikt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2021/1/23.
 */

@RestController
public class IndexController {

    @Value("${com.wqezr.url}")
    private String url;

    @RequestMapping("/getUrl")
    public String getUrl(){
        return url;
    }

}
