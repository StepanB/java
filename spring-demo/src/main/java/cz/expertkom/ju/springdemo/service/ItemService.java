package cz.expertkom.ju.springdemo.service;

import java.util.List;

import cz.expertkom.ju.interfaces.entity.Item;

public interface ItemService {

	Item getItem(Long id);
	
	void create(Item item);

	List<Item> findAll();
	
	void delete(Long id);
	
	void update(Item item);
}
