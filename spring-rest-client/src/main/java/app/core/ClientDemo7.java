package app.core;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class ClientDemo7 {

	public static void main(String[] args) {

		try {
			String url1 = "http://localhost:8080/api/employee/find-one?empId=5";
			RestTemplate rt = new RestTemplate();
			// when we want to get the result in a response object
			ResponseEntity<Employee> resp = rt.getForEntity(new URI(url1), Employee.class);

			System.out.println(resp.getStatusCode());
			Employee emp = resp.getBody();
			System.out.println(emp);

		} catch (RestClientException e) {
			System.err.println("ERROR: " + e.getMessage());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

	}

}
