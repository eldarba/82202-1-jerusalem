package app.core;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class ClientDemo6 {

	public static void main(String[] args) {

		try {
			// the url for the request
			// get one
			String url1 = "http://localhost:8080/api/employee/find-one?empId=5";
			// get all
			String url2 = "http://localhost:8080/api/employee/all";
			RestTemplate rt = new RestTemplate();
			// send a request and get a response
			Employee e = rt.getForObject(new URI(url1), Employee.class);
			// when we want to get the result directly
			Employee[] arr = rt.getForObject(new URI(url2), Employee[].class);
			System.out.println(e);
			System.out.println(Arrays.toString(arr));
		} catch (RestClientException e) {
			System.err.println("ERROR: " + e.getMessage());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

	}

}
