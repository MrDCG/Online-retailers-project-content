package com.fsClothes.content.service;

import java.util.List;


import com.fsClothes.pojo.Advertisement;
import com.fsClothes.pojo.Product;

/** 
* @author MrDCG 
* @version 创建时间：2020年3月30日 下午12:13:25 
*
*/
public interface AdvertisementService {
	List<Advertisement> findAllAd();

	void delete(int id);

	void batchDelete(String checkedId);

	List<Product> findIsShelf();

	void adAdd(Advertisement advertisement);

	void update(Advertisement advertisement);
}
