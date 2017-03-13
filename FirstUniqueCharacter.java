package edu.hubu.leetCode;

/**
 * leetCode 387
 * 解法：
 * 1、定义一个长度为26的数组
 * 2、将字符串的每一位与'a'相减，然后在数组的对应为上+1
 * 3、数组中第一个=1的元素即是想要的
 * @author sucan
 *
 */

public class FirstUniqueCharacter {
	public int firstUniqChar(String s){
		if(s == null || s.length() == 0){
			return -1;
		}
		int[] res = new int[26];
		for(int i = 0;i < s.length();i++){
			res[s.charAt(i)-'a']++;
		}
		for(int i = 0; i < s.length();i++){
			if(res[s.charAt(i)-'a'] == 1){
				return i;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int res = new FirstUniqueCharacter().firstUniqChar("lovelovelog");
		System.out.println(res);
	}
}
