package app.core.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//@Aspect
public class LogAspect2 {

	@Pointcut("execution(String div(int, int))") // pointcut expression
	public void div() { // pointcut signature
	}

	// advice
	@Before("div()") // use pointcut signature to apply pointcut expression
	public void beforeDiv(JoinPoint jp) {
		System.out.println(">>> @Before " + jp.getSignature().getName());
	}

	@After("div()")
	public void afterDiv(JoinPoint jp) {
		System.out.println(">>> @After " + jp.getSignature().getName());
	}

	@AfterReturning(pointcut = "div()", returning = "res")
	public void afterDivReturns(JoinPoint jp, String res) {
		System.out.println(">>> @AfterReturning "

				+ jp.getSignature().getName()

				+ " > " + res);
	}

	@AfterThrowing(pointcut = "div()", throwing = "e")
	public void afterDivThrows(JoinPoint jp, Exception e) {
		System.out.println(">>> @AfterThrowing "

				+ jp.getSignature().getName()

				+ " Error: " + e);
	}

	@Around("div()")
	public Object aroundDiv(ProceedingJoinPoint jp) throws Throwable {
		try {
			System.out.println(">>> @Around - before proceed");
			Object res = jp.proceed();
			return res; // we can return the result as is
//			return "מה שבא לי להחזיר"; // we can change the return result if needed
		} catch (Throwable e) {
			// 1. we can handle in the advice
			return "INFINITY"; // provide alternative result
			// 2. we can forward to the business code - main
//			throw e; // forward the exception to the join point
		} finally {
			System.out.println(">>> @Around - after proceed");
		}
	}

//	@Before("execution(* *.*(..))")
//	public void logAll(JoinPoint jp) {
//		System.out.println(">>> Log Before: " + jp);
////		System.out.println(">>> Log Before: " + jp.getSignature().getName());
//
//	}

}
