package com.fsClothes.content.service.impl;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.fsClothes.content.service.CartService;
import com.fsClothes.mapper.CartMapper;
import com.fsClothes.pojo.CartItem;






/**
 * @author MrDCG
 * @version 创建时间：2019年9月16日 下午4:08:49
 *
 */

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartMapper cartMapper;
	@CacheEvict(value="redisCacheManager",key="'findCartItems'")
	@Override
	public void insertCart(CartItem ci) {
		// 查找该用户是否已经添加该商品
		CartItem item = cartMapper.findByUserId(ci.getUserId(),ci.getProductId());
			if(item!=null) {
					//更新商品数量
					cartMapper.updateCartItemPCount(ci.getPCount()+item.getPCount());
					return;
			}
		
		//没有查到商品则直接增加购物车商品
		cartMapper.insertCart(ci);
	}
	@Cacheable(value="redisCacheManager",key="'findCartItems'")
	@Override
	public List<CartItem> findCartItems(int userId) {
		return cartMapper.findCartItems(userId);
	}
	@CacheEvict(value="redisCacheManager",key="'findCartItems'")
	@Override
	public void deleteCartItem(int id) {
		cartMapper.deleteCartItem(id);
	}
	@CacheEvict(value="redisCacheManager",key="'findCartItems'")
	@Override
	public void batchDelCartItems(String checkedId) {
		cartMapper.batchDelCartItems(checkedId.split(","));
	}
}
