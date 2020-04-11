package com.fsClothes.content.service;



import java.util.List;

import com.fsClothes.pojo.ProductImgPath;

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
	

}
