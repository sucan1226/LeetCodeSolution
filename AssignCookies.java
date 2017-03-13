package edu.hubu.leetCode;

import java.util.Arrays;

/**
 * leetCode 455
 * @author sucan
 *
 */

public class AssignCookies {
	public int findContentChildren(int[] g,int[] s){
		 //1.��������������
		Arrays.sort(g);
		Arrays.sort(s);
		//2.�����ǰ���ɴ�СС������У�ָ��ǰ�ƣ���������ǰ��
		int i = 0;
		int j = 0;
		while(i < g.length && j < s.length){
			if(g[i] > s[j]){
				j++;
			}else{
				i++;
				j++;
			}
		}
		//3.����ָ��λ��
		return i+1;
	}
}
