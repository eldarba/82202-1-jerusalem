package app.core.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import app.core.services.JwtUtil;
import io.jsonwebtoken.JwtException;

@Service
public class LoginFilter implements Filter {

	@Autowired
	private JwtUtil jwtUtil;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// cast the req/res object to http
		// the incoming request - from which we get the token
		HttpServletRequest req = (HttpServletRequest) request;
		// the response in case we block the request and send error from the filter
		HttpServletResponse resp = (HttpServletResponse) response;
		
		// Access-Control-Max-Age: 86400
		// set the amount of seconds to keep the 
		//access control permissions from the server
		// after that time another preflight request is needed
		resp.setHeader("Access-Control-Max-Age", "120");

		// get the token
		String token = req.getHeader("token");

		if (token != null) {
			try {
				// check the token validity
				jwtUtil.extractAllClaims(token);
				// pass the request to the next filter - in our case the controller method
				chain.doFilter(request, response); // pass the request
				return;
			} catch (JwtException e) {
				// in case of a browser user-agent (CORS policy) we need to headers for CORS
				resp.addHeader("Access-Control-Allow-Origin", "http://localhost:5500");
				resp.sendError(HttpStatus.UNAUTHORIZED.value(), "invalid token: " + e.getMessage());
				return;
			}

		} else {
			// if we are here we don't have a token
			// check if this is a preflight request
			if (req.getMethod().equalsIgnoreCase("OPTIONS")) {
				System.out.println("this is preflight");
				chain.doFilter(request, response); // pass the request
				return;
			}

			// this is not a preflight request - we simply dont have a token
			resp.addHeader("Access-Control-Allow-Origin", "http://localhost:5500");
			resp.sendError(HttpStatus.UNAUTHORIZED.value(), "you are not logged in");
		}

	}

}
