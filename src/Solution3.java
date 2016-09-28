import java.util.*;

public class Solution3 {
	public static void main(String args[]){
//		Solution3 test1 = new Solution3();
//		String test1result = Arrays.toString(test1.findPowerOfThree(-1));
//		System.out.println(test1result);
//		
//		Solution3 test2 = new Solution3();
//		System.out.println(test2.countDigits(-1));
//		
//		Solution3 test3 = new Solution3();
//		test3.printNumbers(10);
		
//		Solution3 test5 = new Solution3();
//		System.out.println(test5.reverseVowels("hello"));
		
//		Solution3 test6 = new Solution3();
//		System.out.println(test6.lengthOfLastWord("A lot of meinv"));
//
//		
//		Solution3 test7 = new Solution3();
//		String test7result = String.valueOf(test7.isVowel('y'));
//		System.out.println(test7result);
		
//		Solution3 test8 = new Solution3();
//		System.out.println(test8.reverseString2("I like soccer"));
		
		Solution3 bonus = new Solution3();
		System.out.println(bonus.checkMessage("SOSSUSSOP"));

	}
	
	/**Q1
	 * Write a method to find N numbers which are power of three. e.g. n=4,
	 * return {1,3,9,27}
	 */
	public int[] findPowerOfThree(int n) {
		if(n <= 0){
			return null;
		}else{
			int[] result = new int[n];
			for(int i = 0; i < n; i++){
				result[i]= (int) Math.pow(3, i);
			}
			return result;
		}
	}
//end of Question1 Solution	
	
	
	/**Q2
	 * Given a integer 'n', return n%count, count is the number of digits of n
	 * For example, n = 100, return 1
	 */
	public int countDigits(int n) {
		String str = Integer.toString(n);
		int count = str.length();
		int result = n % count;
		return result;
	}
//end of Question2 Solution
	
	
	/**Q3
	 * Given a integer 'n', if n is odd, print n odd numbers, if n is even,
	 * print n even numbers. For example, n = 3, print 1 3 5 n = 4, print 0 2 4
	 * 6
	 */
	public void printNumbers(int n){
		List<Integer> list = new ArrayList<Integer>();
		//corner value n <= 0;
		if(n <=0){
			System.out.println("Not a valid input");
		}

		//the first situation: n is odd;
		if(n % 2==1){
			for(int i=1; i<= n; i++){
				list.add(i*2-1);
				continue;
			}
		}
		//the second situation: n is even
		if(n % 2==0){
			for(int i=1; i<= n; i++){
				list.add(i*2-2);
				continue;
			}
		}
//		print all the numbers in the ArrayList list
		for(Integer number : list){
			System.out.print(number + " ");
		}
	//end of the Question3 Solution
	}

	/**Q4
	 * Given numRows, generate the first numRows of Pascal's triangle. For
	 * example, given numRows = 5, return: [1] [1,1] [1,2,1] [1,3,3,1]
	 * [1,4,6,4,1]
	 */
	public int[][] generatePascalsTriangle(int n) {
		int[][] triangle = new int[n][];
		for(int row = 0; row <= n; row++){
			triangle[row] = new int[row + 1];
			triangle[row][0] = 1;
			triangle[row][row] = 1;
			for(int column = 1; column < row; column++){
				triangle[row][column] = triangle[row-1][column-1] + triangle[row-1][column];
			}
		}
		return triangle;
	}
	
	/**Q5
	 * Write a function that takes a string as input and reverse only the vowels
	 * of a string. For example: Given s = "hello", return "holle".
	 */
	public String reverseVowels(String s) {
		int len = s.length();
		int leftV = 0;
		int rightV = len-1;
		char[] arr = s.toCharArray();
		while(leftV < rightV){
			if(!isVowel(s.charAt(leftV))){
				leftV++;
				continue;
			}
			if(!isVowel(s.charAt(rightV))){
				rightV--;
				continue;
			}
			char temp = s.charAt(leftV);
			arr[leftV]= s.charAt(rightV);
			arr[rightV] = temp;
			leftV++;
			rightV--;
		}
		String result = new String(arr);
		return result;
	}
		
		public static boolean isVowel(char character){
			if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
				return true;
			}else{
				return false;
			}
		}

	/**Q6
	 * Given a string s consists of upper/lower-case alphabets and empty space
	 * characters ' ', return the length of last word in the string. If the last
	 * word does not exist, return 0. Note: A word is defined as a character
	 * sequence consists of non-space characters only.
	 */
//	"A lot of meinv"
	//""
	public int lengthOfLastWord(String str) {
		String[] cutString = str.split(" ");
		int size = cutString.length;
		String string = cutString[size-1];
		int len = string.length();
		return len;
	}
	
	/**Q7
	 * Reverse a string by words. Do not use 'split' function. e.g. "I like
	 * soccer" --> "soccer like I"
	 */
	public String reverseString2(String str) {
		StringBuffer reverse = new StringBuffer();
		int j = str.length();
		for(int i = str.length()-1; i >= 0; i-- ){
			if(str.charAt(i) == ' '){
				j = i;
			}else if(i ==0 || str.charAt(i-1) == ' '){
//				add space between word
				if(reverse.length() != 0){
					reverse.append(' ');
				}
				reverse.append(str.substring(i, j));
			}
				
//			the 1st step(the basic step) is to iterate the str from back to front, and append every word to the StringBuffer.
//			the word is recognized by space  (charAt(i) == ' ')  or start of the original string    (i == 0)
//			find the begining index of word( charAt(i-1) ==' ') or start of the original string    (i == 0)
//			the end index of word:  (str.length()-1) or reinitiate the j when charAt(i) == ' '
//			str.substring()
//			reverse.append(str)
		}
//		the return value should be String instead of StringBuffer
		return reverse.toString();
	}

	// Bonus
	/**
	 * A robot from Mars send a long message to Earth which only contains many
	 * "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS" But the radiation from universe
	 * changed some characters of the massage. Write a method to count how many
	 * characters were changed. For example, "SOSSOSSOS" might be changed to
	 * "SOSSUSSOP", then your method should return 2. The message was consisted
	 * by "SOS" so its length will be multiple of 3. You could assume the
	 * message only contains upper letter.
	 */
	public int checkMessage(String message) {
		int len = message.length();
		int count = 0;
		for(int i = 0; i < len; i++){
			if((i % 3 == 0) || (i %3 == 2)){
				if(message.charAt(i) != 'S'){
					count++;
				}
			}
			if(i % 3 == 1){
				if(message.charAt(i) != 'O'){
					count++;
				}
			}
		}
		return count;
	}
}


















