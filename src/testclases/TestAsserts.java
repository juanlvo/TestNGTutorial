package testclases;

import org.testng.Assert;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

/***
 * Section 28 Lecture 154 
 * Assertions
 * 
 * @author juanl
 *
 */
public class TestAsserts {
	
	@Test
	public void testSum() {
		System.out.println("\nRunning Test -> testSum");
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		Assert.assertEquals(result, 3);
	}
	
	@Test
	public void testString() {
		System.out.println("\nRunning Test -> testString");
		String expectedString = "Hello World";
		SomeClassToTest obj = new SomeClassToTest();
		String result = obj.addString("Hello", "World");
		Assert.assertEquals(result, expectedString);
	}
	
	@Test
	public void testArray() {
		System.out.println("\nRunning Test -> testArray");
		int[] expectedArray = {1, 2, 3, 4};
		SomeClassToTest obj = new SomeClassToTest();
		int[] result = obj.getArray();
		Assert.assertEquals(result, expectedArray);
		System.out.println("\nEnd Test");
	}
}
