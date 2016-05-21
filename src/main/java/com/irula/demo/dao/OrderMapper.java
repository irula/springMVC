package com.irula.demo.dao;

import com.irula.demo.model.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderSn);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderSn);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}