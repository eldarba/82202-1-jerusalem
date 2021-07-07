package app.core.types;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car implements Vehicle {

//	@Resource
	@Autowired
	private Engine carEngine;

	@Override
	public void drive() {
		this.carEngine.start();
		System.out.println("drive like a car");
	}

}
