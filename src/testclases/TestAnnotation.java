package testclases;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;

/***
 * Section 28 Lecture 153 First TestNG Class
 * 
 * @author juanl
 *
 */
public class TestAnnotation {
	
	@Test
	public void testMethod1() {
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		System.out.println("Running Test -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Running Test -> testMethod3");
	}
}
