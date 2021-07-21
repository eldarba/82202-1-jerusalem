package app.core.aspects;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import app.core.annotations.MyLogAnnotation;

@Component
@Aspect
public class LogAspect3 {

	@Before("logAnnotation()")
	public void logAdvice(JoinPoint jp) {
		System.out.println(">>> @Before");
		try {
			Method method = jp

					.getTarget()

					.getClass()

					.getDeclaredMethod(jp.getSignature().getName(), int.class, int.class);

			MyLogAnnotation logAnnotation = method.getAnnotation(MyLogAnnotation.class);

			System.out.println("value: " + logAnnotation.value());
			System.out.println("key: " + logAnnotation.key());
			System.out.println("condition: " + logAnnotation.printMethodName());

			if (logAnnotation.printMethodName()) {
				System.out.println("method name - " + jp.getSignature().getName());
			}

		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	@Pointcut("@annotation(app.core.annotations.MyLogAnnotation)")
	public void logAnnotation() {
	}

}
