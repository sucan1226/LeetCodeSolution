package edu.hubu.leetCode;

/**
 * 将十进制数转换成7进制数
 * leetCode 504
 * @author sucan
 *
 */

public class Base7 {
	public String convertToBase7(int num){
		String result = "";
		if(Math.abs(num) < 7){
			return String.valueOf(num);
		}
		while(num / 7 != 0){
			String temp = String.valueOf(Math.abs(num % 7));
			num = num / 7;
			result = temp + result ;
		}
		return num + result;
	}
	
	public static void main(String[] args) {
		String res = new Base7().convertToBase7(-50);
		System.out.println(res);
	}
}
