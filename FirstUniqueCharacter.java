package edu.hubu.leetCode;

/**
 * leetCode 387
 * �ⷨ��
 * 1������һ������Ϊ26������
 * 2�����ַ�����ÿһλ��'a'�����Ȼ��������Ķ�ӦΪ��+1
 * 3�������е�һ��=1��Ԫ�ؼ�����Ҫ��
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
