package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.services.JwtUtil;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ApiController {
	
	@Autowired
	private JwtUtil jwtUtil; 
	
	@GetMapping("/greet")
	public String greet(@RequestHeader String token) {
		return "Hello " + jwtUtil.extractUsername(token);
//		return "Hello ";
	}

}
