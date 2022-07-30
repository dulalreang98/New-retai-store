package com.dulal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dulal.service.StoreService;
import com.dulal.store.Store;

@Controller
public class StoreController {
	@Autowired
	StoreService storeService;
	
	@GetMapping(value="/home")
	public String homeForm() {
		return "homePage";
	}
	
	@GetMapping(value="/new-store")
	public String storeForm() {
		return "new_store";
	}
	@GetMapping(value="/all-store")
	public String allStore(Model model) {
		List<Store>stores = storeService.getAllStore();
		model.addAttribute("stores", stores);
		return "allStore";
	}
	@GetMapping(value="/pstore")
	public String pStore() {
		return "pStore";
	}
	
	@PostMapping("/add-store-data")
	public String addStore(Store store) {
		storeService.saveStoreData(store);
		return "redirect:/all-store";
	}
	
	@RequestMapping(path={"/search"})
	public String search(Store store, Model model,String keyword) {
		if(keyword != null) {
			List<Store> stores = storeService.getByKeyword(keyword);
			model.addAttribute("stores", stores);
	
		}
		else {
			List<Store>stores = storeService.getAllStore();
			model.addAttribute("stores", stores);
		}
		return "pStore";
	}
	

}
