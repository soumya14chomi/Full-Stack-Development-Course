package com.example.AOP.config;

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

import com.example.AOP.model.Employee;

@Aspect
@Component
public class GeneralInterceptorAspect {

//	@Pointcut("execution(* com.example.AOP.controller.*.*(..))")
//	@Pointcut("this(com.example.APO.service.DepartmentService)")
	@Pointcut("@annotation(com.example.AOP.annotation.CustomAnnotation)")
	public void loggingPointCut() {

	}

	/*
	 * @Before("loggingPointCut()") public void before(JoinPoint joinPoint) {
	 * System.out.println("Before method Invocked::" + joinPoint.getSignature()); }
	 * 
	 * @After("loggingPointCut()") public void after(JoinPoint joinPoint) {
	 * System.out.println("After method Invocked::" + joinPoint.getSignature()); }
	 */

	/*
	 * @AfterReturning(value = "execution(* com.demo.AOP_BSM69.controller.*.*(..))",
	 * returning = "employee") public void after(JoinPoint joinPoint, Employee
	 * employee) {
	 * 
	 * System.out.println("After method Invocked::" + employee);
	 * 
	 * }
	 */

	/*
	 * @AfterThrowing(value = "execution(* com.demo.AOP_BSM69.controller.*.*(..))",
	 * throwing = "e") public void after(JoinPoint joinpoint, Exception e) {
	 * System.out.println("After method Invoked with Exception::" + e.getMessage());
	 * }
	 */

	@AfterThrowing(value = "loggingPointCut()", throwing = "e")
	public void after(JoinPoint joinpoint, Exception e) {
		System.out.println("After method Invoked with Exception::" + e.getMessage());
	}

	@Around("loggingPointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Before Method invoked:" + joinPoint.getArgs()[0]);

		Object object = joinPoint.proceed();

		if (object instanceof Employee) {
			System.out.println("After Method Invoked..Employee..." + joinPoint.getArgs()[0]);
		} else {
			System.out.println("After Method Invoked..." + joinPoint.getArgs()[0]);
		}
		return object;
	}

}
