package edu.hubu.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * leetCode 442
 * 判断数组中出现两次的元素的个数
 * 要求：
 * 算法复杂度o(n)
 */

import java.util.List;

public class FindAllDuplicatesInArray {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> result = new ArrayList<Integer>();
		if(nums == null){
			return null;
		}
		Arrays.sort(nums);
		for(int i = 1;i < nums.length;i++){
			if(nums[i] == nums[i-1]){
				result.add(nums[i]);
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		List r = new FindAllDuplicatesInArray().findDuplicates(new int[]{1});
		for (Object object : r) {
			System.out.println(object);
		}
	}
}
