package appcode;

/***
 * Section 28 Lecture 153
 * First TestNG Class
 * 
 * Section 28 Lecture 154
 * Assertions
 * 
 * @author juanl
 *
 */
public class SomeClassToTest {

	public int sumNumbers(int a, int b) {
		return a + b;
	}
	
	public String addString(String a, String b) {
		return a+" "+b;
	}
	
	public int[] getArray() {
		int[] arrayExample = {1, 2, 3};
		return arrayExample;
	}
}
