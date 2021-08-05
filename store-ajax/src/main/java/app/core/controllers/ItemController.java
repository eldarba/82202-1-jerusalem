package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.beans.Item;

@CrossOrigin
@RestController
@RequestMapping("/api/item")
public class ItemController {

	private List<Item> items = new ArrayList<>();
	private int currentId = 101;

	@PostMapping
	public int add(@RequestBody Item item) {
		item.setId(currentId++);
		this.items.add(item);
		return item.getId();
	}

	@GetMapping("/{itemId}")
	public Item getOne(@PathVariable int itemId) {
		Item item = new Item();
		item.setId(itemId);
		int index = this.items.indexOf(item);
		if (index != -1) {
			return this.items.get(index);
		} else {
			String msg = "item with id " + itemId + " not found";
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, msg);
		}
	}

	@GetMapping
	public List<Item> getAll() {
		return this.items;
	}

	@PutMapping
	public Item update(@RequestBody Item item) {
		Item itemFromStore = getOne(item.getId());
		if (itemFromStore != null) {
			itemFromStore.setName(item.getName());
			itemFromStore.setPrice(item.getPrice());
			return itemFromStore;
		}
		return null;
	}

	@DeleteMapping
	public boolean delete(@RequestParam int itemId) {
		Item item = new Item(itemId, null, 0);
		return this.items.remove(item);
	}

}
