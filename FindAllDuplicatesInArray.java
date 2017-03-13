package edu.hubu.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * leetCode 442
 * �ж������г������ε�Ԫ�صĸ���
 * Ҫ��
 * �㷨���Ӷ�o(n)
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
