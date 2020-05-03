package com.fsClothes.content.service;

import java.util.List;

import com.fsClothes.pojo.CartItem;
import com.fsClothes.pojo.CartItemVO;

/**
 * @author MrDCG
 * @version 创建时间：2019年9月16日 下午4:08:14
 *
 */
public interface CartService {
	/**
	 * 添加商品进购物车
	 * @param ci 需要添加进购物车的商品
	 */
	void insertCart(CartItem ci);
	
	/**
	 * 查找用户的购物车列表
	 * @param userId 用户id
	 * @return 购物车商品列表
	 */
	List<CartItem> findCartItems(int userId);
	/**
	 * 删除购物车商品
	 * @param id 购物车商品id
	 */
	void deleteCartItem(int id);
	/**
	 * 批量删除
	 * @param checkedId
	 */
	void batchDelCartItems(String checkedId);
	
	/**
	 * 根据传进来的id查找items
	 * @param checkedId id字符串
	 * @return item集合
	 */
	List<CartItem> findCartItemsById(String checkedId);
	/**
	 * 更新cartItem数量
	 * @param ciVO id，PCount集合
	 */
	void updatePCount(List<CartItemVO> ciVO);
	
}