package edu.hubu.leetCode;

/**
 * leetCode 338
 * 给定一个num求0-num之间的数，每一个数的二进制1的个数
 * @author sucan
 *
 */

public class CountingBits {
	public int[] countBits(int num){
		//结果数组的长度为num+1
		int[] res = new int[num+1];
		for(int i = 1;i <= num;i++){
			//当前数组元素，应该等于i右移一位对应元素+i与1的与(判断末尾是不是1)
			res[i] = res[i >> 1] + (i&1);
		}
		return res;
	}
}
