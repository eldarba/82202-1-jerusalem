package app.core;

import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@SpringBootApplication
public class JwtDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(JwtDemoApplication.class, args);
		
		Instant now = Instant.now();
		
		// define signature algorithm for the authentication key;
//		String algorithm = "HmacSHA256";
		String algorithm = SignatureAlgorithm.HS256.getJcaName();
		System.out.println(algorithm);
		
		// set the encoded secret key - for signing the JWT
		byte[] secretKeyEncoded = "this+is+my+key+and+it+must+be+at+least+256+bits+long".getBytes();
		// decode the secret key to base 64 (platform neutral)
		byte[] secretKeyDecoded = Base64.getDecoder().decode(secretKeyEncoded);
		// prepare the key for the token signature (for authentication)
		// SecretKeySpec - used to construct a secret key from a byte array
		Key key = new SecretKeySpec(secretKeyDecoded, algorithm);
		
		// create a jwt using the Jwts factory
		String token = Jwts.builder()
				.signWith(key)
				.setSubject("eldarba@gmail.com")
				.setIssuedAt(Date.from(now))
				.setExpiration(Date.from(now.plus(30, ChronoUnit.SECONDS)))
				.claim("first name", "Eldar")
				.claim("last name", "Bakshi")
				.compact();
		System.out.println(token); 
		
		// parsing the JWS to get the JWT
		System.out.println("\nparse===========================");
		
		// parse + validate
		JwtParser jwtParser = Jwts.parserBuilder().setSigningKey(key).build();
		Jws<Claims> expandedJWT = jwtParser.parseClaimsJws(token);
		System.out.println(expandedJWT);
		
		System.out.println("header");
		System.out.println(expandedJWT.getHeader());
		System.out.println("body");
		System.out.println(expandedJWT.getBody());
		System.out.println("signature");
		System.out.println(expandedJWT.getSignature());
		
		// get the pay load items
		Claims claims = expandedJWT.getBody();
		Object  iat = claims.get("first name");
		System.out.println(iat); 
	}

}
