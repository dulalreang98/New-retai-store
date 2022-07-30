package com.dulal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.dulal.store.Store;

public interface StoreRepo extends CrudRepository<Store,Integer>{
	
@Query(value = "select*from Store s where s.store_name like %:keyword%", nativeQuery = true)
List<Store>findByKeyword(@Param("keyword") String keyword);
}
