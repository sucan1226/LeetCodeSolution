package edu.hubu.leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
You are given two arrays (without duplicates) nums1 and nums2 where nums1��s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number. 
 */

/**
 * ����ջ���Ӻ���ǰ����nums,ÿ��ջ��Ϊ�յ�ʱ�򣬳�ջ��ֱ��ջ�Ķ���Ԫ�ش���nums[i],
 * ʹ��map���ϣ��洢nums��ÿһ��Ԫ���Լ�����Ӧ����һ�����Ԫ�ء����ֹͣ��ջΪ�վ�Ϊ-1���������ջ�Ķ���
 * Ԫ�ء�
 * ��󷵻���findNums�д��ڵ�Ԫ��
 */

import java.util.Stack;

public class NextGreaterElement {

	public int[] nextGreatElement(int[] findNums,int[] nums){
		int[] result = new int[findNums.length]; //���ս��
		Stack<Integer> s = new Stack<Integer>();  //ջ
		Map<Integer,Integer> m = new HashMap<Integer, Integer>();   //����
		
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
		
		//��findNums�е�ֵ�ҵ���������
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
