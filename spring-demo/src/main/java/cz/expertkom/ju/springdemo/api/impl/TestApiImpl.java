package cz.expertkom.ju.springdemo.api.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import cz.expertkom.ju.interfaces.UserService;
import cz.expertkom.ju.interfaces.entity.Item;
import cz.expertkom.ju.interfaces.entity.User;
import cz.expertkom.ju.springdemo.api.TestApi;
import cz.expertkom.ju.springdemo.dto.ItemDto;
import cz.expertkom.ju.springdemo.dto.Items;
import cz.expertkom.ju.springdemo.service.ItemService;

public class TestApiImpl implements TestApi {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ItemService itemService;

	@Override
	public Response test(String param) {
		 User user = userService.getUser(param);
		 return Response.ok(user).build();
	}

	@Override
	public Response item() {
		Item item = new Item();
		item.setText("test");
		itemService.create(item);
		return Response.ok().build();
	}

	@Override
	public Response item(String text) {
		Item item = new Item();
		item.setText(text);
		itemService.create(item);
		return Response.ok().build();
		
	}
	@Override
	public Response itemsList() {
		List<Item> result = itemService.findAll();
		Items items = new Items();
		items.setItems(result);
		return Response.ok(items).build();
	}

	@Override
	public Response saveItem(ItemDto itemDto) {
		Item item = new Item();
		item.setText(itemDto.getText());
		itemService.create(item);
		return Response.noContent().build();
	}

	@Override
	public Response delete(Long param) {
		itemService.delete(param);
		return Response.noContent().build();
	}

	@Override
	public Response updateItem(Long id, ItemDto itemDto) {
		Item item = itemService.getItem(id);
		item.setText(itemDto.getText());
		itemService.update(item);
		return Response.noContent().build();
	}
	
	

}
