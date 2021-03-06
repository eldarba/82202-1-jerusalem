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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.beans.Product;

@CrossOrigin
@RestController
@RequestMapping("/api/products")
public class ProductsController {

	private List<Product> products = new ArrayList<>();
	private int currentId = 1;

	@PostMapping
	public int add(@RequestBody Product product, @RequestHeader String token) {
		System.out.println("=========== token is: " + token);
		product.setId(currentId++);
		for (Product p : products) {
			if (product.getName().equals(p.getName())) {
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "duplicate product name");
			}
		}

		this.products.add(product);
		return product.getId();

	}

	public int add(Product product) {
		return add(product, null);
	}

	@GetMapping("/{productId}")
	public Product getOne(@PathVariable int productId, @RequestHeader String token) {
		Product product = new Product();
		product.setId(productId);
		int index = this.products.indexOf(product);
		if (index != -1) {
			return this.products.get(index);
		} else {
			String msg = "product with id " + productId + " not found";
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, msg);
		}
	}

	@GetMapping
	public List<Product> getAll(@RequestHeader String token) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this.products;
	}

	@PutMapping
	public Product update(@RequestBody Product product, @RequestHeader String token) {
		Product productFromStore = getOne(product.getId(), token);
		if (productFromStore != null) {
			productFromStore.setName(product.getName());
			productFromStore.setPrice(product.getPrice());
			productFromStore.setStock(product.getStock());
			return productFromStore;
		}
		return null;
	}

	@DeleteMapping
	public boolean delete(@RequestParam int productId, @RequestHeader String token) {
		Product product = new Product(productId);
		return this.products.remove(product);
	}

}
