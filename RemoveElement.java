package edu.hubu.leetCode;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.

   Do not allocate extra space for another array, you must do this in place with constant memory.

   The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * @author sucan
 *
 */

public class RemoveElement {

public int removeElement(int[] nums, int val) {
	
		if(nums == null || nums.length == 0){
			return 0;
		}
		int len = 0;
		for(int i = 0;i < nums.length;i++){
			if(nums[i] != val){
				if(nums[i] != nums[len]){
					nums[len] = nums[i];
				}
				len++;
			}
		}
		return len;
	}
	
}
