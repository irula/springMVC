package com.irula.demo;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.irula.demo.model.Order;
import com.irula.demo.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:mybatis-config.xml" })
public class TestOrderService {

	private static final Logger LOGGER = Logger.getLogger(TestOrderService.class);

	@Autowired
	private OrderService orderService;

	@Test
	public void testQueryById1() {
		Order userInfo = orderService.getOrderById(13164667);
		LOGGER.info(JSON.toJSON(userInfo));
	}


/*	@Test
	public void testInsert() {
		UserInfo userInfo = new UserInfo();
		userInfo.setUname("xiaoming");
		userInfo.setUnumber(4);
		int result = userService.insert(userInfo);
		System.out.println(result);
	}*/
}
