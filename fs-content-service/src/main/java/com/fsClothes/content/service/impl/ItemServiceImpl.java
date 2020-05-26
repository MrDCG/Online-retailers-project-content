package com.fsClothes.content.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsClothes.content.service.ItemService;
import com.fsClothes.mapper.ItemMapper;
import com.fsClothes.pojo.Comment;
import com.fsClothes.pojo.Page;
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
	@Override
	public Page<Comment> findAllCommentByPage(Page<Comment> page,int productId) {
		page.setTotalRecord(itemMapper.findAllCommenCount(productId));
		page.setList(itemMapper.findAllComment(page.getStartIndex(), page.getPageSize(),productId));
		
		return page;
	}
	@Override
	public Page<Product> searchItems(Page<Product> page, String keywords,Integer categoryId) {
		page.setTotalRecord(itemMapper.searchItemCount(keywords,categoryId));
		page.setList(itemMapper.searchItems(page.getStartIndex(), page.getPageSize(),keywords,categoryId));
		
		return page;
	}

}
