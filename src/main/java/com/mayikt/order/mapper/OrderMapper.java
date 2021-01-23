package com.mayikt.order.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2021/1/22.
 */
public interface OrderMapper {

    @Insert("INSERT INTO `order`(`name`) VALUES (#{name})")
    public Boolean insert(@Param("name") String name);

}
