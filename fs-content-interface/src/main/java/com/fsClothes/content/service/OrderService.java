package com.fsClothes.content.service;

import java.util.List;

import com.fsClothes.pojo.Addressee;
import com.fsClothes.pojo.CartItemVO;
import com.fsClothes.pojo.Order;
import com.fsClothes.pojo.OrderConditionVO;
import com.fsClothes.pojo.OrderItemOV;
import com.fsClothes.pojo.OrderVO;
import com.fsClothes.pojo.Page;

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
	/**
	 * 查找订单商品
	 * @param limit 限制查找条数
	 * @param userId 用户id
	 * @return 订单商品信息
	 */
	List<OrderItemOV> findOrderItems(Integer limit, Integer userId, Integer status);
	/**
	 * 修改订单状态
	 * @param status 订单状态
	 * @param orderNo 订单号
	 */
	void updateOrderStatus(int status,String orderNo);
	/**
	 * 查找所有订单分页
	 * @param page 分页pojo
	 * @return 分页订单
	 */
	Page<OrderVO> findOrdersByPage(Page<OrderVO> page);
	/**
	 * 删除订单只能删除用户已签收的 
	 * @param checkedId 订单id
	 */
	void orderDelete(String checkedId);
	/**
	 * 根据条件查询订单并分页
	 * @param page 分页信息
	 * @param orderConditionVO 查询条件
	 * @return 订单信息
	 */ 
	Page<OrderVO> getOrder(Page<OrderVO> page, OrderConditionVO orderConditionVO);
	
	
}