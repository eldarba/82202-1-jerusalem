package app.core.types;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CarEngine implements Engine {

	@Override
	public void start() {
		System.out.println("starting car engine");

	}

}
