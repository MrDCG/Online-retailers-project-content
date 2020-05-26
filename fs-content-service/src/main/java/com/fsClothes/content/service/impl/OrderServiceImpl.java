package com.fsClothes.content.service.impl;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsClothes.content.service.OrderService;
import com.fsClothes.mapper.OrderMapper;
import com.fsClothes.pojo.Addressee;
import com.fsClothes.pojo.CartItemVO;
import com.fsClothes.pojo.Order;
import com.fsClothes.pojo.OrderConditionVO;
import com.fsClothes.pojo.OrderItemOV;
import com.fsClothes.pojo.OrderVO;
import com.fsClothes.pojo.Page;






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

	@Override
	public List<OrderItemOV> findOrderItems(Integer limit,Integer userId,Integer status) {
		return orderMapper.findOrderItems(limit,userId,status);
	}

	@Override
	public void updateOrderStatus(int status,String orderNo) {
		orderMapper.updateOrderStatus(status,orderNo);
		
	}

	@Override
	public Page<OrderVO> findOrdersByPage(Page<OrderVO> page) {
		page.setTotalRecord(orderMapper.findOrdersCount());
		page.setList(orderMapper.findOrdersByPage(page.getStartIndex(), page.getPageSize()));
		
		return page;
	}

	@Override
	public void orderDelete(String checkedId) {
		orderMapper.orderDelete(checkedId.split(","));
	}

	@Override
	public Page<OrderVO> getOrder(Page<OrderVO> page, OrderConditionVO orderConditionVO) {
		
    	
    	page.setTotalRecord(orderMapper.findConditionCount(orderConditionVO));
    	System.out.println(page.getTotalRecord());
		page.setList(orderMapper.findCondition(page.getStartIndex(), page.getPageSize(),orderConditionVO));
		
		return page;
	}
	
}
