package app.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	// http://localhost:8080/api/greet
//	@RequestMapping(method = RequestMethod.GET, path = "/greet")
	@GetMapping("/greet")
	public String greet() {
		return "Hello Spring Web";
	}

	// http://localhost:8080/api/add?a=43&b=64
	@PostMapping("/add")
	public int add(@RequestParam int a, @RequestParam int b) {
		return a + b;
	}

}
