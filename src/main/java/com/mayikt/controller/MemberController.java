package com.mayikt.controller;

import com.mayikt.member.mapper.MemberMapper;
import com.mayikt.member.service.MemberServcice;
import com.mayikt.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2021/1/22.
 */

@RestController
public class MemberController {

    @Autowired
    private MemberServcice memberServcice;

    @Value("${com.wqezr.userName}")
    private String userName;

    @RequestMapping("/addUser")
    public String addUser(String name){
        return memberServcice.addUser(name)?"success":"fail";
    }


    @RequestMapping("/getUserName")
    public String getUserName(){
        return userName;
    }
}
