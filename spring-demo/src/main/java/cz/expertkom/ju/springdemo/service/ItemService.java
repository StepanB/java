package cz.expertkom.ju.springdemo.service;

import java.util.List;

import cz.expertkom.ju.interfaces.entity.Item;

public interface ItemService {

	Item getItem(Long id);
	
	Item getItem(String id);
	void create(Item item);

	List<Item> findAll();
	
//	void delete(Long id);
	
	void delete(String id);
	
	void update(Item item);
}
