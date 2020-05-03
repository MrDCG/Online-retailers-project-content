package com.fsClothes.content.service.impl;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsClothes.content.service.OrderService;
import com.fsClothes.mapper.CartMapper;
import com.fsClothes.mapper.OrderMapper;
import com.fsClothes.pojo.Addressee;
import com.fsClothes.pojo.CartItemVO;
import com.fsClothes.pojo.Order;






/**
 * @author MrDCG
 * @version 创建时间：2019年9月16日 下午4:08:49
 *
 */

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public void insertOrder(Order order) {
		orderMapper.insertOrder(order);
		
	}

	@Override
	public void insertSalesItems(List<CartItemVO> ciVOs, String orderNo) {
		orderMapper.insertSalesItems(ciVOs,orderNo);
	}

	@Override
	public void insertSalesOrder(Integer userId, Addressee addresseeinfo, String orderNo, int status) {
		orderMapper.insertSalesOrder(userId,addresseeinfo,orderNo,status);
		
	}
	
}
