package com.iiht.coronakit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.coronakit.dao.KitDetailRepository;
import com.iiht.coronakit.entity.KitDetail;
import com.iiht.coronakit.exception.ProductException;

@Service
public class KitDetailServiceImpl implements KitDetailService {

	@Autowired
	KitDetailRepository repository;
	
	@Override
	public KitDetail addKitItem(KitDetail kitItem) throws ProductException {
		// TODO Auto-generated method stub
		if (kitItem!=null)			
		{
//			if (repository.existsByCoronaKitId(kitItem.getCoronaKitId()))
//			{
//				throw new ProductException("CoronaKit id already exists");
//			}
			repository.save(kitItem);
		}
		return kitItem;
	}

	@Override
	public KitDetail getKitItemById(int itemId) {
		// TODO Auto-generated method stub
		return repository.findById(itemId).orElse(null);
	}

	@Override
	public List<KitDetail> getAllKitItemsOfAKit(int kitId) {
		return repository.findAllCoronaKitId(kitId);
		// TODO Auto-generated method stub
		//return repository.findAll();
		
	}

}
