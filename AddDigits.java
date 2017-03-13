package edu.hubu.leetCode;

/**
 *  Given a non-negative integer num, 
 *  repeatedly add all its digits until the result has 
 *  only one digit.
	For example:
	Given num = 38, the process is like: 
	3 + 8 = 11, 
	1 + 1 = 2. Since 2 has only one digit, return it. 
	
	Follow up:
	Could you do it without any loop/recursion in O(1) runtime? 
 * @author sucan
 *
 */

public class AddDigits {

	public int addDigits(int num){
		//1 - 1;2 - 2 ...9 - 9;10 - 1; 18 - 9;...
		//每9个循环一次结果
		num = (num-1) % 9 + 1;
		return num;
		
	}
	
	public static void main(String[] args) {
		int res = new AddDigits().addDigits(131);
		System.out.println(res);
	}
}
