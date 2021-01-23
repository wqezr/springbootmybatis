package com.mayikt.member.service;

import com.mayikt.member.mapper.MemberMapper;
import com.mayikt.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

/**
 * Created by Administrator on 2021/1/22.
 */

@Service
public class MemberServcice {

    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Transactional()
    public Boolean addUser(String name){
        Boolean insert = memberMapper.insert(name);
        int a= 1/0;
        orderMapper.insert(name);
        return insert;
    }

}
