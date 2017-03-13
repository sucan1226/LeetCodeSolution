package edu.hubu.leetCode;

/**
 * 在一个数组中找出只出现了一次的那个数字
 * 要求，o(n)
 * 一般常规解法的话，可能很容易想到，但是要实现o(n)的话，这里我采用xor运算
 * 而且这有一个很好的地方就是，0^0也是等于0的，于是就解决了我们考虑到数组只有一个0的时候
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
