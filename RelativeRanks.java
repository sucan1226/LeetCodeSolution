package edu.hubu.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给出一个数组找出相对排名，找出最大的三个数，并且，赋值给"Gold Medal", "Silver Medal", "Bronze Medal"
 * 其余的给出其相对排名
 * 如：[1,3,4,2,5,7]
 * Expected answer:
 * ["6","4","Bronze Medal","5","Silver Medal","Gold Medal"]
 * @author sucan
 *
 */
public class RelativeRanks {
	public String[] findRelativeRanks(int[] nums){
		String[] result = new String[nums.length];;
		Map map = new HashMap();
		int length = nums.length;
		//复制数组
		int[] numsCopy = Arrays.copyOf(nums, nums.length);
		//排序
		Arrays.sort(nums);
		//考虑数组长度为1,2,3的情况
		if(nums.length == 1){
			map.put(nums[length-1], "Gold Medal");
		}
		if(nums.length == 2){
			map.put(nums[length-1], "Gold Medal");
			map.put(nums[length-2], "Silver Medal");
		}
		if(nums.length == 3){
			map.put(nums[length-1], "Gold Medal");
			map.put(nums[length-2], "Silver Medal");
			map.put(nums[length-3], "Bronze Medal");
		}
		//大于三的时候
		if(nums.length > 3){
			for(int i = length,j = 0;i > 3&&j < length-3;i--,j++){
				//将数组元素，和对应的排序下标映射
				map.put(nums[j],String.valueOf(i));
			}
			map.put(nums[length-1], "Gold Medal");
			map.put(nums[length-2], "Silver Medal");
			map.put(nums[length-3], "Bronze Medal");
		}
		//给返回结果赋值
		for(int i = 0;i < map.size();i++){
			result[i] =  (String) map.get(numsCopy[i]);
		}
		return result;
	}
	
	public static void main(String[] args) {
		String[] r = new RelativeRanks().findRelativeRanks(new int[]{1,3,2});
		for (String string : r) {
			System.out.println(string);
		}
	}
}
