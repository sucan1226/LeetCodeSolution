package edu.hubu.leetCode;

/**
 * �ƶ������е�0��ĩβ����0��Ԫ���ƶ��������λ��
 * Ҫ��:
 * ������copyһ������
 * ���ٵ����ֲ���
 * @author sucan
 *
 */

public class MoveZeros {
	public void moveZeros(int[] nums){
		/**
		 * ����˫��ָ��ķ���
		 */
		int j = 0;//������һ��ָ�룬��ʼʱָ������ĵ�һλ
		int temp; //���ڽ�������Ԫ��
		for(int i = 0;i < nums.length;i++){
			if(nums[i] != 0){
				temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}
		for (int i : nums) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		new MoveZeros().moveZeros(new int[]{0,1,0,3,12});
	}
}
