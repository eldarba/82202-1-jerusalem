package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.services.JwtUtil;
import app.core.services.JwtUtil.UserDetails;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private JwtUtil jwtUtil; 
	
	@PostMapping
	public String login(@RequestParam String user, @RequestParam String password) {
		if(user.equals("admin") && password.equals("123")) {
			UserDetails userDetails = new UserDetails(user, null, null);
			String token = jwtUtil.generateToken(userDetails);
			return token;
		}else {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "bad credentials");
		}
	}
	
	
	

}
