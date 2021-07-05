package app.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import app.core.types.Person;

@ComponentScan
@Configuration
public class Config {

	@Bean("p18")
	public Person getPerson18Kid() {
		// create an object and set its state
		Person p = new Person(0, "KID", 18);
		// return the object
		return p;
	}

}
