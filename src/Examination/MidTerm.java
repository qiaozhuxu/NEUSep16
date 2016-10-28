package Examination;

import java.util.HashSet;

public class MidTerm {
	/**Say you have Given a string which consists of lowercase or uppercase letters, 
	 * find the length of the longest palindromes that can be built with those letters.
	This is case sensitive, for example "Aa" is not considered a palindrome here.**/

		public int longestPalindrome(String s) {
		     // corner case of s
				if(s == null){
					return 0;
				}
				int count = 0;
			    HashSet<Character> set = new HashSet<Character>();
			    for(char cha : s.toCharArray()){
			        if(set.contains(cha)){
			            count++;
			            set.remove(cha);
			        }else{
			            set.add(cha);
			        }
			    }
			    
			    if(set.isEmpty()){
			        return count*2;
			    }else{
			        return count*2 + 1;
			    }
	    }//close method longestPalindrome
	/**an array for which the ith element is the price of a given stock on day i.
	 *  Design an algorithm to find the maximum profit. 
	 *  You may complete as many transactions as you like 
	 *  (ie, buy one and sell one share of the stock multiple times). 
	 *  However, you may not engage in multiple transactions at the same time
	 *   (ie, you must sell the stock before you buy again).**/

	public int maxProfit(int[] prices) {
		//corner case
        if(prices == null || prices.length == 1){
            return 0;
        }
        int profit = 0;
        for(int i = 0 ;i < prices.length - 1; i++){
            if(prices[i + 1] > prices[i] ){
                profit += (prices[i + 1] - prices[i]);
            }
        }
        return profit;
    }//close method maxProfit
	/**Given a column title as appear in an Excel sheet, return its corresponding column number.
			For example: A -> 1, B -> 2, … Z -> 26, AA -> 27, AB -> 28**/
	public int titleToNumber(String title) {
		//demo: Z(0*26 +26),AA 27......AZ (52),BA(53 =2* 26 + 1)****
		//ZA(26*26 + 1) ZZ (26* 26 + 26),AAA(26*26+ 26+1)
		//corner case;
		if(title == null){
			return 0;
		}
		//we should start counting from the end of the string
		int len = title.length();
		int result = 0;
		for(int i = len-1; i >= 0; i--){
			result += (title.charAt(i)-'A'+ 1)*Math.pow(26, len-1-i);
		}
    	return result;// finish your code inside.
	}//close method titleToNumber
	
	/**Given an unsorted array of integers(no duplicates), count the pairs in which there are two numbers and they add up to a specific target number. The array is given as follows:
		For example:
		Input: nums={2, 7, 11, 15}, target=9, there is one pair {2,7} so return: 1
		Input: nums={2, 7, 11, 15}, target=10, there is no pair so return 0.
		Input: nums={1,5,2,4,3,6}, target=7, there is are three pairs {1,6}, {2,5}, {3,4} so return 3.
		Note: {1,2} and {2,1} are regarded as the same pair.
		More-Bonus: If you can do it in O(N) time, you will get extra 5 points.**/
		public int twoSum(int[] nums, int target) {
			//corner case: nums == null;
			if(nums == null){
				return 0;
			}
			//corner case: nums only has the integer target;
			if(nums.length == 1 && nums[0] == target){
				return 1;
			}
			//corner case:nums has one int, but it is not target;
			if(nums.length == 1 && nums[0] != target){
				return 0;
			}
			//create a hashset to store the value
			HashSet<Integer> set = new HashSet<Integer>();
			
			int count = 0;
			for(int i : nums){
				if(set.contains(target - i)){
					count++;
				}else{
					set.add(i);
				}
			}//close for loop
			return count;
		}//close method twoSum


	public static void main(String[] args) {
		MidTerm testBonus = new MidTerm();
		int[] nums = new int[]{1};
		System.out.println(testBonus.twoSum(nums, 7));
	}

}
