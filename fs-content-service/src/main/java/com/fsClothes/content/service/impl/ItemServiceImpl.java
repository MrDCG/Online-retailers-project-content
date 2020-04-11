package com.fsClothes.content.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsClothes.content.service.ItemService;
import com.fsClothes.mapper.ItemMapper;
import com.fsClothes.pojo.ProductImgPath;

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

}
