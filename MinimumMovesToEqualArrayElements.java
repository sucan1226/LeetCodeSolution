package edu.hubu.leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * leetCode 453

 * @author sucan
 *
 */

public class MinimumMovesToEqualArrayElements {
	//下面这种解法有一个巨坑的地方，就是栈溢出(如果出现太大的数字)
	int flag = 0;
	public int minMoves(int[] nums){
		Arrays.sort(nums);
		Set<Integer> set  = new HashSet<Integer>();
		for(int i = 0;i < nums.length;i++){
			set.add(nums[i]);
		}
		if(set.size() != 1){
			for(int i = 0;i < nums.length-1;i++){
				nums[i] = nums[i]+1;
			}
			flag += 1;
			minMoves(nums);
		}
		return flag;
	}
	/**
	 * 题目是让我们将n-1个数字同时+1，最少需要多少次操作才能让数组中所有的数字相等。上面的
	 * 解法中，我们用了一个很自然的想法，就是每次将除了最大值之外的所有值加1，然后我还用了set集合
	 * 来判断数组是否已经达到平衡，但是“栈溢出”。
	 * 
	 * 正确解法应该是将n-1个数加1的效果，等同于将最大值减一，那么问题就可以转换成将数组减成最小值
	 * 
	 * @param args
	 */
	public int minMoves1(int[] nums){
		//1.将数组中的最小值找出来
		int min = Integer.MAX_VALUE;
		for (int num : nums) {
			min = Math.min(num, min);
		}
		//数组中所有值减一需要的次数就是最后的结构
		int res = 0;
		for(int num : nums){
			res += num -min;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int result = new MinimumMovesToEqualArrayElements().minMoves(new int[]{1,5,2});
		System.out.println(result);
	}
}
