package cz.expertkom.ju.springdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.expertkom.ju.interfaces.entity.Item;
import cz.expertkom.ju.repo.repository.ItemRepository;
import cz.expertkom.ju.springdemo.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public Item getItem(Long id) {
		return itemRepository.getItemById(id);
	}

	@Override
	public Item getItem(String id) {
		return itemRepository.getItemById(id);
	}
	@Override
	public void create(Item item) {
		itemRepository.save(item);
	}
	
	@Override
	public List<Item> findAll() {
		return itemRepository.findAll();
	}

//	@Override
//	public void delete(Long id) {
//		itemRepository.delete(id);	
//	}
	
	@Override
	public void delete(String id) {
		itemRepository.delete(id);	
	}

	@Override
	public void update(Item item) {
		itemRepository.save(item);
	}
	
	
	
	

}
