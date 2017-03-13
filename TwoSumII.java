package edu.hubu.leetCode;

/**
 * ���Ѿ��ź�������飬Ҫ�������е�����Ԫ����ӵ���target,
 * �������Ԫ���±꣨��1��ʼ��
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author sucan
 *
 */

public class TwoSumII {
	public int[] twoSum(int[] numbers,int target){
		int[] result = new int[2];
		//��������ָ�룬�ֱ���������ͷ��β
		if(numbers == null || numbers.length < 2){
			return result;
		}
		int first = 0;
		int end = numbers.length-1;
		while(end > first){
			int sum = numbers[first] + numbers[end];
			if(sum == target){
				result[0] = first+1;
				result[1] = end+1;
				return result;
			}
			else if(sum > target){
				end--;
			}else{
				first ++;
			}
	
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] res = new TwoSumII().twoSum(new int[]{1,2,3,4,5},6);
		for (int i : res) {
			System.out.println(i);
		}
	}
}
