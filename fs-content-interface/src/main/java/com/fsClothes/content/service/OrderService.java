package com.fsClothes.content.service;

import java.util.List;

import com.fsClothes.pojo.Addressee;
import com.fsClothes.pojo.CartItemVO;
import com.fsClothes.pojo.Order;

/**
 * @author MrDCG
 * @version 创建时间：2019年9月16日 下午4:08:14
 *
 */
public interface OrderService {
	/**
	 * 添加订单
	 * @param order 订单
	 */
	void insertOrder(Order order);
	/**
	 * 添加销售商品
	 * @param ciVOs 销售商品vo
	 * @param orderNo 订单号
	 */
	void insertSalesItems(List<CartItemVO> ciVOs, String orderNo);
	/**
	 * 添加销售商品订单详情
	 * @param userId 用户id
	 * @param addresseeinfo 收件人信息
	 * @param orderNo 订单号
	 * @param status 订单状态
	 * 
	 */
	void insertSalesOrder(Integer userId, Addressee addresseeinfo, String orderNo, int status);
	
	
}