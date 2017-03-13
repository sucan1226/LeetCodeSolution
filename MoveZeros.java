package edu.hubu.leetCode;

/**
 * 移动数组中的0到末尾，非0的元素移动到最近的位置
 * 要求:
 * 不能是copy一个数组
 * 最少的数字操作
 * @author sucan
 *
 */

public class MoveZeros {
	public void moveZeros(int[] nums){
		/**
		 * 才用双端指针的方法
		 */
		int j = 0;//类似于一个指针，开始时指向数组的第一位
		int temp; //用于交换数组元素
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
