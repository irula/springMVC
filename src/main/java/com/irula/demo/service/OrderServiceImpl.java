/**
 * 
 */
package com.irula.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irula.demo.dao.OrderMapper;
import com.irula.demo.model.Order;

/**
 * @author Administrator
 *
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;
	
	public Order getOrderById(Integer id) {
		return orderMapper.selectByPrimaryKey(id);
	}

	public int insert(Order orderInfo) {
		int result = orderMapper.insert(orderInfo);
		System.out.println(result);
		return result;
	}

}
