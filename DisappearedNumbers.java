package edu.hubu.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1<= nums <= n(数组长度)
 * 需要找出没有在数组中出现的数字
 * 算法要求o(n)
 * 采用正负数标记法
 * 1.标记当前元素为n,然后将num[n-1]取负
 * 2.最后取出元素>0的下标+1就是结果
 * @author sucan
 *
 */

public class DisappearedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> numbers  = new ArrayList<Integer>();
		int[] temp = Arrays.copyOf(nums, nums.length);
		for(int i = 0;i < nums.length;i++){
			temp[nums[i]-1] = -nums[nums[i]-1];
		
		}
		for(int i = 0;i < temp.length;i++){
			if(temp[i] > 0){
				numbers.add(i+1);
			}
		}
		return numbers;
		
    }
	
	public static void main(String[] args) {
		DisappearedNumbers nums = new DisappearedNumbers();
		List<Integer> list = nums.findDisappearedNumbers(new int[]{4,5,2,7,8,2,3,1});
		for (Integer  i : list) {
			System.out.println(i);
		}
	}
}
