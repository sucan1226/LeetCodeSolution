package edu.hubu.leetCode;

/**
 * leetCode 541
 * ���������ڻ�������漰���ַ���֮���ƴ�ӣ����Բ���StringBuilder
 * ͬʱStringBuilder�Ļ����ṩһ����ת��������
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
			//��һ���ж�k
			j = i+k <= s.length()?i+k:s.length();
			builder.append(new StringBuilder(s.substring(i, j)).reverse().toString());
			
			if(j > s.length())break;
			
			//�Ժ�ÿ������k
			i = j;
			j = i+k <= s.length()?i+k:s.length();
			builder.append(s.substring(i,j));
			
			i = j;
		}
		return builder.toString();
	}
	
}
