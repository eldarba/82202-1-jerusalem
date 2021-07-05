package app.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import app.core.types.Person;

@ComponentScan
@Configuration
public class Config {

	@Bean("p18")
	@Scope("singleton")
	@Lazy
	public Person getPerson18Kid() {
		// create an object and set its state
		Person p = new Person(0, "KID", 18);
		// return the object
		return p;
	}

	@Bean("txt")
	public String getText() {
		return "Hello";
	}

	// if we do not specify id the default is method name
	@Bean
	@Scope("prototype")
	public int getRandom() {
		return (int) (Math.random() * 101);
	}

}
