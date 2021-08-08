package app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.services.JwtUtil;
import app.core.services.JwtUtil.UserDetails;
import app.core.services.JwtUtil.UserDetails.UserType;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private JwtUtil jwtUtil;
	
	public String login(String userId, String userEmail, UserType userType, String password) {
		UserDetails userDetails = new UserDetails(userId, userEmail, userType);
		
		switch(userType) {
		case ADMIN:
			if(!(userId.equals("admin") && userEmail.equals("admin@mail") && password.equals("admin"))) {
				throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "bad credentials");
			}
			break;
			
		case COMPANY:
		case CUSTOMER:
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "this user type is not yet supported");
			
			default:
				throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "invalid user type");
		}
		
		// if we are here we should let the client in and give the token
		String token = jwtUtil.generateToken(userDetails);
		return token;
	}
	
	

}
