package edu.hubu.leetCode;

import java.util.Arrays;

/**
 * Given a binary array, find the maximum number 
 * of consecutive 1s in this array.
 * 从一个只包含0,1数组中找出最大数字1连续一样的长度
 * @author sucan
 *
 */

public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		if(nums == null || nums.length == 0){
            return 0;
        }
		int maxConsecutive = 0;
		int temp = 0;
		for(int i = 0;i < nums.length;i++){
			if(nums[i] == 1){
				temp ++;
			}else if(i > 0 && nums[i-1] == nums[i] && nums[i] == 1){
				temp++;
			}
			else{
				temp = 0;
			}
			maxConsecutive = temp > maxConsecutive?temp:maxConsecutive;
		}
		if(maxConsecutive == 0 && nums[nums.length-1] == 1){
			return 1;
		}
		return maxConsecutive;
	}
	
	public static void main(String[] args) {
		MaxConsecutiveOnes m = new MaxConsecutiveOnes();
		int max = m.findMaxConsecutiveOnes(new int[] {1,1});
		System.out.println(max);
	}
}
