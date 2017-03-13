package edu.hubu.leetCode;

/**
 * 字符串t由字符串s随机加一个字符组成，找出这个加的字符
 * @author sucan
 *
 */


public class FindDifference {
	public char findTheDifference(String s,String t){
		char res = 0;
		for(int i = 0;i < s.length();i++){
			res ^= s.charAt(i);
		}
		System.out.println("res="+res);
		for(int i = 0;i < t.length();i++){
			res ^= t.charAt(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		FindDifference diff = new FindDifference();
		char c = diff.findTheDifference("abcd", "dcadb");
		System.out.println(c);
	}
}
