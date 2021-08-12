package app.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.Entry;
import app.core.services.Dictionary;

@RestController
@RequestMapping("/api/dictionary")
public class EntryController {
	
	@Autowired
	private Dictionary dictionary;
	
	@PostMapping
	public int add(@RequestBody Entry entry) {
		return dictionary.add(entry);
	}

	@GetMapping
	public Entry get(@RequestParam int entryId) {
		return dictionary.get(entryId);
	}

	@PutMapping
	public Entry update(@RequestBody Entry entry) {
		return dictionary.update(entry);
	}

	@DeleteMapping()
	public boolean delete(@RequestParam int entryId) {
		return dictionary.delete(entryId);
	}

}
