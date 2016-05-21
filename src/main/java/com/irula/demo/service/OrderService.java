/**
 * 
 */
package com.irula.demo.service;

import java.util.List;

import com.irula.demo.model.Order;

/**
 * @author Administrator
 *
 */
public interface OrderService {
	Order getOrderById(Integer id);

	int insert(Order orderInfo);

}
