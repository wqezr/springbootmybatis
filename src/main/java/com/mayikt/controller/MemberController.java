package com.mayikt.controller;

import com.mayikt.member.mapper.MemberMapper;
import com.mayikt.member.service.MemberServcice;
import com.mayikt.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2021/1/22.
 */

@RestController
public class MemberController {

    @Autowired
    private MemberServcice memberServcice;

    @RequestMapping("/addUser")
    public String addUser(String name){
        return memberServcice.addUser(name)?"success":"fail";
    }
}
