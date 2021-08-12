package app.core;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import app.core.entities.Entry;
import app.core.entities.Sentence;

public class Client {

	public static void main(String[] args) {
		
		// the object for making client requests
		RestTemplate rt = new RestTemplate();
		// the url of the request
		String url = "http://localhost:8080/api/dictionary?entryId=1";
		// make the request and get the object
		Entry entry = rt.getForObject(url, Entry.class);
		System.out.println(entry);
		
		// GET
		try {
			// define a request with http method and uri
			RequestEntity<?> req = new RequestEntity<>(HttpMethod.GET, new URI(url));
			// make the request and get a response
			ResponseEntity<Entry> res = rt.exchange(req, Entry.class);
			// extract the object from the response body
			entry = res.getBody();
			System.out.println(entry);
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}
		
		// POST
		url = "http://localhost:8080/api/dictionary";
		try {
			// define a request with http method and uri
			entry = new Entry("Table", "a furniture");
			entry.setSentences(Arrays.asList(new Sentence("a furniture", "book 1"), new Sentence("some place to write", "book 2")));
			RequestEntity<Entry> req = new RequestEntity<>(entry, HttpMethod.POST, new URI(url));
			// make the request and get a response
			ResponseEntity<Integer> res = rt.exchange(req, Integer.class);
			
			// extract the object from the response body
			int entryId = res.getBody();
			System.out.println(entryId);
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}
		
		// or use post for object
		int entryId = rt.postForObject(url, entry, Integer.class);

	}

}
