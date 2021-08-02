package app.core;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class ClientDemo4 {

	public static void main(String[] args) {

		try {
			// the url for the request
			String url = "http://localhost:8080/api/employee/update";
			URI uri = new URI(url);
			// the request
			Employee e = new Employee(2, "Benny", "Fisherman");
			RequestEntity<Employee> req = new RequestEntity<>(e, HttpMethod.PUT, uri);
			// the rest template can exchange data with the server (request-response)
			RestTemplate rt = new RestTemplate();
			// send a request and get a response
			ResponseEntity<String> resp = rt.exchange(req, String.class);
			// get the body of the response as an employee object
			System.out.println(resp.getStatusCode());
			String msg = resp.getBody();
			System.out.println("the message: " + msg);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (RestClientException e) {
			System.err.println("ERROR: " + e.getMessage());
		}

	}

}
