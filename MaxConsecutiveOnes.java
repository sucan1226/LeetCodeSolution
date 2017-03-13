package edu.hubu.leetCode;

import java.util.Arrays;

/**
 * Given a binary array, find the maximum number 
 * of consecutive 1s in this array.
 * ��һ��ֻ����0,1�������ҳ��������1����һ���ĳ���
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
