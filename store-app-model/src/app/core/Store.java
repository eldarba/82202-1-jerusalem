package app.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {

	private List<Item> items = new ArrayList<Item>();

	// CRUD operations
	public void add(Item item) {
		this.items.add(item);
	}

	public List<Item> getItems() {
		return items;
	}

	public boolean update(Item item) {
		for (Item curr : items) {
			if (curr.getName().equals(item.getName())) {
				curr.setPrice(item.getPrice());
				return true;
			}
		}
		return false;
	}

	public boolean delete(String itemName) {
		Iterator<Item> it = this.items.iterator();
		while (it.hasNext()) {
			Item curr = it.next();
			if (curr.getName().equals(itemName)) {
				it.remove();
				return true;
			}
		}
		return false;
	}

}
