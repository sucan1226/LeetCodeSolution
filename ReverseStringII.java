package edu.hubu.leetCode;

/**
 * leetCode 541
 * 分析：由于会大量的涉及到字符串之间的拼接，所以采用StringBuilder
 * 同时StringBuilder的话还提供一个反转函数给我
 * @author sucan
 *
 */

public class ReverseStringII {
	public String reverseStr(String s,int k){
		StringBuilder builder = new StringBuilder();
		String result;
		if(s.length() == 0)return result = new String();
		
		int i = 0,j = 0;
		while(i < s.length()){
			//第一次判断k
			j = i+k <= s.length()?i+k:s.length();
			builder.append(new StringBuilder(s.substring(i, j)).reverse().toString());
			
			if(j > s.length())break;
			
			//以后每次增长k
			i = j;
			j = i+k <= s.length()?i+k:s.length();
			builder.append(s.substring(i,j));
			
			i = j;
		}
		return builder.toString();
	}
	
}
