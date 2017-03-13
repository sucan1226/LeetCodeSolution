package edu.hubu.leetCode;

import java.util.Arrays;

/**
 * leetCode 455
 * @author sucan
 *
 */

public class AssignCookies {
	public int findContentChildren(int[] g,int[] s){
		 //1.将两个数组排序
		Arrays.sort(g);
		Arrays.sort(s);
		//2.如果当前饼干大小小于满足感，指针前移，否则两个前移
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
		//3.返回指针位置
		return i+1;
	}
}
