package app.core.types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car implements Vehicle {

	// dependency injection (DI) is injecting a helper object to this object
	@Autowired
	@Qualifier("turboEngine") // specify which bean to inject
	private Engine engine;

	@Override
	public void drive() {
		this.engine.start();
		System.out.println("drive like a car");
	}

}
