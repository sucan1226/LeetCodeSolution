package edu.hubu.leetCode;

/**
 * ��һ���������ҳ�ֻ������һ�ε��Ǹ�����
 * Ҫ��o(n)
 * һ�㳣��ⷨ�Ļ������ܺ������뵽������Ҫʵ��o(n)�Ļ��������Ҳ���xor����
 * ��������һ���ܺõĵط����ǣ�0^0Ҳ�ǵ���0�ģ����Ǿͽ�������ǿ��ǵ�����ֻ��һ��0��ʱ��
 * @author sucan
 *
 */

public class SingleNumber {
	
	public int singleNumber(int[] nums) {
		int result = 0;
		for(int i = 0; i< nums.length;i++){
			result ^= nums[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		SingleNumber single = new SingleNumber();
		int num = single.singleNumber(new int[]{2,1,2,5,4,1,4});
		System.out.println(0^0);
	}
        
}
