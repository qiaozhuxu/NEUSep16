import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito.*;

public class Solution3Test {
	Solution3 test;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUp() throws Exception {
		test = new Solution3();
	    System.setOut(new PrintStream(outContent));
	}

	@Test
	public void testFindPowerOfThree() {
		int[] result_FindPowerOfThree = test.findPowerOfThree(4);
		int[] expected_result_FindPowerOfThree = {1,3,9,27};
		assertArrayEquals(result_FindPowerOfThree, expected_result_FindPowerOfThree);
	}

	@Test
	public void testCountDigits() {
		int result_CountDigits = test.countDigits(100);
		int expected_Result_CountDigits = 1;
		assertEquals(result_CountDigits, expected_Result_CountDigits);
	}

	@Test
	public void testPrintNumbers() {
		test.printNumbers(3);
		String outContentString = outContent.toString();
		assertEquals("1 3 5 ", outContentString);
	}

	@Test
	public void testGeneratePascalsTriangle() {
		int[][] result_GeneratePascalsTriangle = test.generatePascalsTriangle(5);
		int[][] expected_Result_GeneratePascalsTriangle = {{1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1}};
		assertEquals(result_GeneratePascalsTriangle.length, expected_Result_GeneratePascalsTriangle.length);
		assertArrayEquals(result_GeneratePascalsTriangle, expected_Result_GeneratePascalsTriangle);
	}

	@Test
	public void testReverseVowels() {
		String result_ReverseVowels = test.reverseVowels("hello");
		String expected_Result_ReverseVowels = "holle";
		assertEquals(result_ReverseVowels, expected_Result_ReverseVowels);
	}

	@Test
	public void testLengthOfLastWord() {
		int result_LengthOfLastWord = test.lengthOfLastWord("I am a student");
		int expected_Result_LengthOfLastWord = 7;
		assertEquals(result_LengthOfLastWord, expected_Result_LengthOfLastWord);
	}

	@Test
	public void testReverseString2() {
		String result_ReverseString2 = test.reverseString2("I like soccer");
		String expected_Result_ReverseString2 = "soccer like I";
		assertEquals(result_ReverseString2, expected_Result_ReverseString2);
	}

	@Test
	public void testCheckMessage() {
		int result_CheckMessage = test.checkMessage("SOSSUSSOP");
		int expected_Result_CheckMessage = 2;
		assertEquals(result_CheckMessage, expected_Result_CheckMessage);
	}
}
