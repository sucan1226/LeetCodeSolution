package edu.hubu.leetCode;

/**
 * 求两个数的加法(不许用+或-运算符)
 * 每一位的加法可以用异或运算来得到
 * 处理进位可以用与运算
 * @author sucan
 *
 */

public class TwoIntegerSums {
	public int getSum(int a,int b){
		
		/**
		 * 
		 */
		while(b != 0){
		int carry = a & b;//得到进位
		a = a^b;
		b = carry << 1;
		}
		return a;
	}
	
	public static void main(String[] args) {
		TwoIntegerSums sum = new TwoIntegerSums();
		System.out.println(sum.getSum(2,3));
	}
}
