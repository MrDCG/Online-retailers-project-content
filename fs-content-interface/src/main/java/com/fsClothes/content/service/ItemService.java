package com.fsClothes.content.service;



import java.util.List;

import com.fsClothes.pojo.Product;
import com.fsClothes.pojo.ProductImgPath;
import com.fsClothes.pojo.SalesItem;

/** 
* @author MrDCG 
* @version 创建时间：2020年3月30日 下午12:13:25 
*
*/
public interface ItemService {

	/**
	 * 查找商品展示图片
	 * @param productId 商品id
	 * @return 商品展示图片集合
	 */
	List<ProductImgPath> findImgPaths(int productId,int isShow);
	/**
	 * 根据id查找商品
	 * @param productId 商品id
	 * @return 商品信息
	 */
	Product findItemInfo(int productId);
	/**
	 * 在SalesItem表中找出销售最多的i款商品
	 * @param i 限制找出最火的商品
	 * @return 商品信息
	 */
	List<Product> findHotProducts(Integer i);
	/**
	 * 根据传入的i查找不同根目录下的商品
	 * @param i 控制根目录
	 * @return 商品信息
	 */
	List<Product> findCategoryProducts(int i);
	

}
