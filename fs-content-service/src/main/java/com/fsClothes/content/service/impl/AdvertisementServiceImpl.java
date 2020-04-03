package com.fsClothes.content.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsClothes.content.service.AdvertisementService;
import com.fsClothes.mapper.AdvertisementMapper;
import com.fsClothes.pojo.Advertisement;
import com.fsClothes.pojo.Product;

/** 
* @author MrDCG 
* @version 创建时间：2020年3月30日 下午1:02:12 
*
*/
@Service
public class AdvertisementServiceImpl implements AdvertisementService {
	@Autowired
	private AdvertisementMapper advertisementMapper;
	@Override
	public List<Advertisement> findAllAd() {
		return advertisementMapper.findAllAd();
	}
	@Override
	public void delete(int id) {
		advertisementMapper.delete(id);
	}
	@Override
	public void batchDelete(String checkedId) {
		advertisementMapper.batchDelete(checkedId.split(","));
	}
	@Override
	public List<Product> findIsShelf() {
		return advertisementMapper.findIsShelf();
	}
	@Override
	public void adAdd(Advertisement advertisement) {
		advertisementMapper.adAdd(advertisement);
	}
	@Override
	public void update(Advertisement advertisement) {
		advertisementMapper.update(advertisement);
	}

}
