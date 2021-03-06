package cz.expertkom.ju.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cz.expertkom.ju.interfaces.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, String> {

	Item getItemById(Long id); 
	Item getItemById(String id); 
	
	
	
}