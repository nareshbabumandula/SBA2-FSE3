package com.iiht.coronakit.service;

import java.util.List;

import com.iiht.coronakit.entity.KitDetail;
import com.iiht.coronakit.exception.ProductException;

public interface KitDetailService {
	public KitDetail addKitItem(KitDetail kitItem) throws ProductException;
	public KitDetail getKitItemById(int itemId);
	public List<KitDetail> getAllKitItemsOfAKit(int kitId);
}
