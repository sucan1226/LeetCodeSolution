package edu.hubu.leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number. 
 */

/**
 * 利用栈，从后往前遍历nums,每当栈不为空的时候，出栈，直到栈的顶部元素大于nums[i],
 * 使用map集合，存储nums中每一个元素以及它对应的下一个最大元素。如果停止后栈为空就为-1，否则就是栈的顶部
 * 元素。
 * 最后返回在findNums中存在的元素
 */

import java.util.Stack;

public class NextGreaterElement {

	public int[] nextGreatElement(int[] findNums,int[] nums){
		int[] result = new int[findNums.length]; //最终结果
		Stack<Integer> s = new Stack<Integer>();  //栈
		Map<Integer,Integer> m = new HashMap<Integer, Integer>();   //集合
		
		for(int i = nums.length-1;i >= 0;i--){
			while(!s.empty()){
				if(s.peek() <= nums[i]){	
					s.pop();
				}else{
					break;
				}
			}
			m.put(nums[i], s.empty()? -1:s.peek());
			s.push(nums[i]);
		}
		
		//将findNums中的值找到，并返回
		for(int i = 0; i < findNums.length;i++){
			result[i] = m.get(findNums[i]);
		}
		return result;
	}
	
	public static void main(String[] args) {
		NextGreaterElement nge = new NextGreaterElement();
		int[] result = nge.nextGreatElement(new int[]{4,1,2},new int[]{1,3,4,2});
		for (int i : result) {
			System.out.println(i);
		}
	}
}
