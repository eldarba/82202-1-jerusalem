package app.core.types.hook;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleBean implements InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(">>> LifeCycleBean started");
	}

	public void work() {
		System.out.println("LifeCycleBean is working");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(">>> LifeCycleBean is destroyed");
	}

	@PostConstruct
	public void doThisOnCreation() {
		System.out.println("--------- creation");
	}

	@PreDestroy
	public void doThisOndestroy() {
		System.out.println("--------- destroy");
	}

}
