package cs380_leetCode;

import java.util.Arrays;

public class CS380_LeetCode {
	class Solution {
		// Static was added to run the method with the main method
	    public static int removeDuplicates(int[] nums) {

	        int indx = 1;
	        for(int i = 0; i < nums.length - 1; i++) {
	            if(nums[i] < nums[i + 1]) {
	                nums[indx] = nums[i + 1];
	                indx++;
	            }
	        }
	        return indx;
	    }
	}
	
	public static void main(String[] args) {
		int[] example1 = {1,1,2};
		int[] example2 = {0,0,1,1,1,2,2,3,3,4};
		
		// Two provided test examples from the LeetCode problem, with the output
		System.out.println("Input: " + Arrays.toString(example1) + "\nOutput: " + Solution.removeDuplicates(example1));
		System.out.println("Input: " + Arrays.toString(example2) + "\nOutput: " + Solution.removeDuplicates(example2));
	}
}
