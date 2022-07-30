package com.dulal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dulal.repo.StoreRepo;
import com.dulal.store.Store;

@Service
public class StoreService {
@Autowired
StoreRepo storeRepo;
public List<Store> getAllStore(){
	List<Store> stores = new ArrayList<Store>();
	storeRepo.findAll().forEach(s1 -> stores.add(s1));
	return stores;
}
public void saveStoreData(Store store) {
	storeRepo.save(store);
}

public Store getbyId(int id) {
	return storeRepo.findById(id).get();
}

public Store editStore(int id) throws Exception {
	Optional <Store> optional = storeRepo.findById(id);
	Store store = null;
	if(optional.isPresent()) {
		store = optional.get();
	}
	else {
		throw new Exception("Retailer not found for id: ::" +id);
	}
	return store;
}
public void deleteStoreById(int id) {
	storeRepo.deleteById(id);
}
public List<Store> getByKeyword(String keyword){
	return storeRepo.findByKeyword(keyword);
}
}
