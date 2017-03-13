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
	//�������ֽⷨ��һ���޿ӵĵط�������ջ���(�������̫�������)
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
	 * ��Ŀ�������ǽ�n-1������ͬʱ+1��������Ҫ���ٴβ������������������е�������ȡ������
	 * �ⷨ�У���������һ������Ȼ���뷨������ÿ�ν��������ֵ֮�������ֵ��1��Ȼ���һ�����set����
	 * ���ж������Ƿ��Ѿ��ﵽƽ�⣬���ǡ�ջ�������
	 * 
	 * ��ȷ�ⷨӦ���ǽ�n-1������1��Ч������ͬ�ڽ����ֵ��һ����ô����Ϳ���ת���ɽ����������Сֵ
	 * 
	 * @param args
	 */
	public int minMoves1(int[] nums){
		//1.�������е���Сֵ�ҳ���
		int min = Integer.MAX_VALUE;
		for (int num : nums) {
			min = Math.min(num, min);
		}
		//����������ֵ��һ��Ҫ�Ĵ����������Ľṹ
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
