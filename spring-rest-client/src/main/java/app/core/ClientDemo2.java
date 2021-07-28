package app.core;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ClientDemo2 {

	public static void main(String[] args) {

		try {
			// the url for the request
			String url = "http://localhost:8080/api/employee/find-one?empId=3";
			URI uri = new URI(url);
			// the request
			RequestEntity<?> req = new RequestEntity<>(HttpMethod.GET, uri);
			// the rest template can exchange data with the server (request-response)
			RestTemplate rt = new RestTemplate();
			// send a request and get a response
			ResponseEntity<Employee> resp = rt.exchange(req, Employee.class);
			// get the body of the response as an employee object
			Employee employee = resp.getBody();
			System.out.println(employee);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

	}

}
