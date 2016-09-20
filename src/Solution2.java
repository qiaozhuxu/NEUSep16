import java.util.Arrays;

class Person {
	int age;
	boolean gender;// false --> male, true --> female

	Person(int age, boolean gender) {
		this.age = age;
		this.gender = gender;
	}
}

public class Solution2 {
	
	public static void main(String[] args) throws Exception{
		//Test for personType method
		Solution2 testPersonType = new Solution2();
		Person infant = new Person(0, false);
		System.out.print("Testing personType for Infant: ");
		testPersonType.personType(infant);
		Person Toddler = new Person(2,true);
		System.out.print("Testing personType for Toddler: ");
		testPersonType.personType(Toddler);
		Person PreSchooler = new Person(4,true);
		System.out.print("Testing personType for PreSchooler: ");
		testPersonType.personType(PreSchooler);
		Person KGGirl = new Person(5,true);
		System.out.print("Testing personType for KGGirl: ");
		testPersonType.personType(KGGirl);
		Person KGBoy = new Person(5,false);
		System.out.print("Testing personType for KGBoy: ");
		testPersonType.personType(KGBoy);
		Person invalid = new Person(-1,true);
		System.out.print("Testing personType for invalid: ");
		testPersonType.personType(invalid);
		Person beyond6 = new Person(8,true);
		System.out.print("Testing personType for beyond 6: ");
		testPersonType.personType(beyond6);
		
		// Test for weirdNumber method
		//Given an integer N as input, check the following: If N is odd, print
		//"Weird". If N is even and, in between the range of 2 and 5(inclusive),
		//print "Not Weird". If N is even and, in between the range of 6 and
		//20(inclusive), print "Weird". If N is even and N>20, print "Not Weird".
		Solution2 testWeirdNumber = new Solution2();
		System.out.print("Test for odd,print Weird: ");
		testWeirdNumber.weirdNumber(8);
		System.out.print("Test for even and, in between the range of 2 and 5(inclusive), print 'Not Weird': ");
		testWeirdNumber.weirdNumber(4);
		System.out.print("Test for even and, in between the range of 6 and 20(inclusive), print 'Weird': ");
		testWeirdNumber.weirdNumber(17);
		System.out.print("Test for even and N>20, print 'Not Weird': ");
		testWeirdNumber.weirdNumber(22);
		
		//Write a method to determine whether a number is prime
		Solution2 testIsPrime = new Solution2();
		System.out.print("Test Number 2 is a Prime: ");
		testIsPrime.isPrime(2);
		System.out.print("Test Number 1 : ");
		testIsPrime.isPrime(1);
		System.out.print("Test Number is a Prime: ");
		testIsPrime.isPrime(29);
		System.out.print("Test Number is not a Prime: ");
		testIsPrime.isPrime(28);

		//Test for fibonacci numbers
		//Find N fibonacci numbers Fibonacci Number: f(N) = f(N-1)+f(N-2).
		//Typically, f(0)=f(1)=1.
		Solution2 testFibonacci= new Solution2();
		int[] f2 = testFibonacci.fibonacciNumber(2);
		System.out.print("Test fibonacci 2 should be [1, 1, 2]: ");
		System.out.println(Arrays.toString(f2));
		int[] f3 = testFibonacci.fibonacciNumber(3);
		System.out.print("Test fibonacci 3 should be [1, 1, 2, 3]: ");
		System.out.println(Arrays.toString(f3));
		int[] f9 = testFibonacci.fibonacciNumber(9);
		System.out.print("Test fibonacci 9 should be [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]: ");
		System.out.println(Arrays.toString(f9));
//		int[] fminus1 = testFibonacci.fibonacciNumber(-1);
		System.out.print("Test fibonacci -1 should be Not a valid input: ");
//		System.out.println(Arrays.toString(fminus1)); 
		
		/**
		 * Write a function that takes a string as input and returns the string
		 * reversed. Given s = "hello", return "olleh".
		 */
		Solution2 testReverseString= new Solution2();
		String helloWorld = "HelloWorld";
		System.out.print("Test HelloWorld, should be reversed as'dlroWolleH': ");
		System.out.println(testReverseString.reverseString(helloWorld));

		Solution2 testFindTheLargestTwo = new Solution2();
		int[] array = {3,5,7,8,9};
		System.out.print("Output should be [9, 8]: ");
		System.out.println(Arrays.toString(testFindTheLargestTwo.findTheLargestTwo(array)));
		
		/**
		 * Given an array nums, write a function to move all 0's to the end of it
		 * while maintaining the relative order of the non-zero elements. For
		 * example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
		 * should be [1, 3, 12, 0, 0].
		 */
		Solution2 testMoveZeroes = new Solution2();
		int[] array2 = {0,3,5,7,0,8,0,9};
		System.out.print("Output should be [3, 5, 7, 8, 9, 0, 0, 0]: ");
		testMoveZeroes.moveZeroes(array2);
		
		/**
		 * Given a non-negative integer n, repeatedly add all its digits until the
		 * result has only one digit. For example: Given n = 38, the process is
		 * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
		 */
 
		Solution2 testAddDigits = new Solution2();
		int result = testAddDigits.addDigits(123);
		System.out.print("The expected result is 1+2+3 = 6: ");
		System.out.println(result);
		int result2 = testAddDigits.addDigits(0);
		System.out.print("The expected result is 0: ");
		System.out.println(result2);
//		int result3 = testAddDigits.addDigits(-1);
//		System.out.print("The expected result is : Not a valid input ");
//		System.out.println(result3);
		int result4 = testAddDigits.addDigits(1);
		System.out.print("The expected result is 1: ");
		System.out.println(result4);

	
	/**
	 * Write a program to check whether a given number is an ugly number. Ugly
	 * numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * For example, 6, 8 are ugly, while 14 is not ugly since it includes
	 * another prime factor 7. Note that 1 is typically treated as an ugly
	 * number.
	 */
	Solution2 testIsUgly = new Solution2();
	boolean result5 = testIsUgly.isUgly(9);
	System.out.print("The expected result is true: ");
	System.out.println(result5);
	
	boolean result6 = testIsUgly.isUgly(14);
	System.out.print("The expected result is false: ");
	System.out.println(result6);
	
	boolean result7 = testIsUgly.isUgly(1);
	System.out.print("The expected result is true: ");
	System.out.println(result7);
	
	boolean result8 = testIsUgly.isUgly(60);
	System.out.print("The expected result is true: ");
	System.out.println(result8);
	
	
	}	
	// Solution
	/**
	 * Write a Computer program to find the type of a person and print the type.
	 * Infant : If the age is less than 1 year Toddler : If the age is less than
	 * 3 and greater than 1 Pre Schooler : If the age is less than 5 and greater
	 * than 3 KG Girl : If the age is greater than 5 and less than 6 and the
	 * gender is female KG Boy : If the age is greater than 5 and less than 6
	 * and the gender is male
	 */
	public void personType(Person person) {
		//age under 0 or greater than 120 is not valid
		//gender
		if(person.age < 0 || person.age > 120){
			System.out.println("Not a valid age!");
		}else if(person.age < 1 && person.age >= 0){
			System.out.println("Infant");
		}else if(person.age < 3 && person.age >= 1){
			System.out.println("Toddler");
		}else if(person.age < 5 && person.age >= 3){
			System.out.println("Pre Schooler");
		}else if(person.age < 6 && person.age >= 5 && person.gender == true){
			System.out.println("KG Girl");
		}else if(person.age < 6 && person.age >= 5 && person.gender == false){
			System.out.println("KG Boy");
		}else{
			System.out.println("Not under 6!!!!");
		}
	}

	/**
	 * Given an integer N as input, check the following: If N is odd, print
	 * "Weird". If N is even and, in between the range of 2 and 5(inclusive),
	 * print "Not Weird". If N is even and, in between the range of 6 and
	 * 20(inclusive), print "Weird". If N is even and N>20, print "Not Weird".
	 */
	public void weirdNumber(int n) {
		//4 scenarios
		if(n % 2 != 0){
			System.out.println("Weird");
		}else if(n %2 == 0 && n >= 2 && n <= 5){
			System.out.println("Not Weird");
		}else if(n %2 == 0 && n >= 6 && n <= 20){
			System.out.println("Weird");
		}else if(n %2 == 0 && n > 20){
			System.out.println("Not Weird");
		}
	}

	/**
	 * Write a method to determine whether a number is prime
	 */
	public void isPrime(int n) {
		//A Prime Number can be divided evenly only by 1,
		//or itself. And it must be a whole number greater than 1.
		int i = 2;
		while (i > 1 && i < n){
			if((n % i) == 0){
				break;
			}
			if(n % i != 0){
				i++;
			}
		}
		
		if(i == n){
			System.out.println(n +" IS A PRIME!");
		}else{
			System.out.println(n + " IS NOT A PRIME!");
		}
	}

	/**
	 * Find N fibonacci numbers Fibonacci Number: f(N) = f(N-1)+f(N-2).
	 * Typically, f(0)=f(1)=1.
	 * @throws Exception 
	 */
	public int[] fibonacciNumber(int n) throws Exception {
		if(n < 0){
			throw new Exception("Not a valid input");
		}
		int[] result = new int[n+1];
		result[0] = 1;
		if(n == 0){
			return result;
		}
		result[1] = 1;
		for(int i = 2; i <= n; i++){
			result[i] = result[i-1] + result[i-2];
		}
		return result;
	}

	/**
	 * Write a function that takes a string as input and returns the string
	 * reversed. Given s = "hello", return "olleh".
	 */
	public String reverseString(String s) {
		char[] string = s.toCharArray();
		int left = 0;
		int right = s.length()-1;
		char temp;
		while(left < right && s.length() >=2){
			temp = string[left];
			string[left] = string[right];
			string[right]= temp;
			left++;
			right--;
		}
//		convert char[] to string
		String result = new String(string);
		return result;
	}

	/**
	 * Given an array of nums, write a function to find the largest two integer.
	 */
	public int[] findTheLargestTwo(int[] nums) {
		//for loop
		//two variable, max, secondMax
		if (nums.length <=2){
			return nums;
		}
		
		int[] theLargestTwo = new int[2];
		
		for(int i = 0; i < nums.length; i++){
			if(nums[i] > theLargestTwo[0]){
				theLargestTwo[0] = nums[i];
			}
		}
		for(int i = 0; i < nums.length; i++){
			if(nums[i] > theLargestTwo[1] && nums[i] < theLargestTwo[0]){
				theLargestTwo[1] = nums[i];
			}
		}

		return theLargestTwo;
	}

	/**
	 * Given an array nums, write a function to move all 0's to the end of it
	 * while maintaining the relative order of the non-zero elements. For
	 * example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
	 * should be [1, 3, 12, 0, 0].
	 */
	public void moveZeroes(int[] nums) {
		//count how many zeros
		//move non-zero number
		//add zero to the end
		int len = nums.length;
		int i = 0;
		int locate = 0;
		while (i < len){
			if(nums[i] != 0){
				nums[locate] = nums[i];
				locate++;
			}
			i++;	
		}
		for(int res = locate; res < len; res++){
			nums[res] = 0;
		}
		System.out.println(Arrays.toString(nums));
	}

	// Bonus
	/**
	 * Given a non-negative integer n, repeatedly add all its digits until the
	 * result has only one digit. For example: Given n = 38, the process is
	 * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	public int addDigits(int n) throws Exception {
		//how to get digit from an int
		if( n < 0){
			throw new Exception("Not a valid input!");
		}
		int res = (int) n/10;
		int sum = n%10;
		while(res > 9){
			sum = sum + res%10;
			res /= 10;
		}
		res = sum +res;
		return res;
	}

	/**
	 * Write a program to check whether a given number is an ugly number. Ugly
	 * numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * For example, 6, 8 are ugly, while 14 is not ugly since it includes
	 * another prime factor 7. Note that 1 is typically treated as an ugly
	 * number.
	 */
	public boolean isUgly (int n) {
		while (n >= 1){
			if(n == 1){
				return true;
			}else if(n %2 ==0 ){
				n /= 2;
			}else if(n %3 ==0 ){
				n /= 3;
			}else if(n %5 ==0 ){
				n /= 5;
			}else{
				return false;
			}
		}
	return true;
	}
}