package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

/***
 * Section 28 Lecture 156 
 * Method and class annotations
 * 
 * Section 28 Lecture 157
 * Running Test Suite
 * 
 * @author juanl
 *
 */
public class BeforeClassAnnotation {

	@BeforeClass
	public void setUp() {
		System.out.println("\nBeforeClassAnnotation -> This runs once before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\nBeforeClassAnnotation -> This run once after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nBeforeClassAnnotation -> This runs before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nBeforeClassAnnotation -> This runs after every method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test -> BeforeClassAnnotation -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -> BeforeClassAnnotation -> testMethod2");
	}

}
