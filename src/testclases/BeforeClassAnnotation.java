package testclases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

/***
 * Section 28 Lecture 156 
 * Method and class annotations
 * 
 * @author juanl
 *
 */
public class BeforeClassAnnotation {

	@BeforeClass
	public void setUp() {
		System.out.println("\nThis runs once before class");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("\nThis run once after class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nThis runs before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nThis runs after every method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("\nRunning Test -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -> testMethod2");
	}

}
