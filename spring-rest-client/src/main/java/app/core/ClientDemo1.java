package app.core;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ClientDemo1 {

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
			ResponseEntity<Map> resp = rt.exchange(req, Map.class);
			// get the body of the response as a map object
			Map resource = resp.getBody();
			System.out.println(resource.get("id"));
			System.out.println(resource.get("name"));
			System.out.println(resource.get("role"));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

	}

}
