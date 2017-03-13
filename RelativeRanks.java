package edu.hubu.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ����һ�������ҳ�����������ҳ����������������ң���ֵ��"Gold Medal", "Silver Medal", "Bronze Medal"
 * ����ĸ������������
 * �磺[1,3,4,2,5,7]
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
		//��������
		int[] numsCopy = Arrays.copyOf(nums, nums.length);
		//����
		Arrays.sort(nums);
		//�������鳤��Ϊ1,2,3�����
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
		//��������ʱ��
		if(nums.length > 3){
			for(int i = length,j = 0;i > 3&&j < length-3;i--,j++){
				//������Ԫ�أ��Ͷ�Ӧ�������±�ӳ��
				map.put(nums[j],String.valueOf(i));
			}
			map.put(nums[length-1], "Gold Medal");
			map.put(nums[length-2], "Silver Medal");
			map.put(nums[length-3], "Bronze Medal");
		}
		//�����ؽ����ֵ
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
