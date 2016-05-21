package com.irula.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.irula.demo.model.Order;
import com.irula.demo.service.OrderService;


/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/showOrder/{id}")
	public String showUserInfo(ModelMap modelMap, @PathVariable Integer id){
		Order order = orderService.getOrderById(id);
		modelMap.addAttribute("order", order);
		return "/order/showOrder";
	}
	
}