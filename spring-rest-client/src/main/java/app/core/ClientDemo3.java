package app.core;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ClientDemo3 {

	public static void main(String[] args) {

		try {
			// the url for the request
			String url = "http://localhost:8080/api/employee/add";
			URI uri = new URI(url);
			// the request
			Employee e = new Employee("Rinna", "Teacher");
			RequestEntity<Employee> req = new RequestEntity<>(e, HttpMethod.POST, uri);
			// the rest template can exchange data with the server (request-response)
			RestTemplate rt = new RestTemplate();
			// send a request and get a response
			ResponseEntity<Long> resp = rt.exchange(req, Long.class);
			// get the body of the response as an employee object
			System.out.println(resp.getStatusCode());
			long id = resp.getBody();
			System.out.println("the id: " + id);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

	}

}
