package com.fsClothes.content.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsClothes.content.service.ItemService;
import com.fsClothes.mapper.ItemMapper;
import com.fsClothes.pojo.Product;
import com.fsClothes.pojo.ProductImgPath;
import com.fsClothes.pojo.SalesItem;

/** 
* @author MrDCG 
* @version 创建时间：2020年3月30日 下午12:13:25 
*
*/
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper itemMapper;
	@Override
	public List<ProductImgPath> findImgPaths(int productId,int isShow) {
		return itemMapper.findImgPaths(productId,isShow);
	}
	@Override
	public Product findItemInfo(int productId) {
		return itemMapper.findItemInfo(productId);
	}
	@Override
	public List<Product> findHotProducts(Integer i) {
		return itemMapper.findHotProducts(i);
	}
	@Override
	public List<Product> findCategoryProducts(int i) {
		return itemMapper.findCategoryProducts(i);
	}

}
