package edu.hubu.leetCode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * leetCode 349
 * ������������Ľ���
 * Ҫ��
 * ����е�Ԫ�ر���Ψһ
 * �������������˳��
 * @author sucan
 *
 */

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1,int[] nums2){
		//1.��������������
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		//2.������ָ��ֱ�ָ�����������ͷ
		int p1=0;
		int p2 = 0;
		//����һ��set���ϴ�Ž��,����ȥ���ظ�ֵ
		Set<Integer> set = new LinkedHashSet<Integer>();
		while(p1 < nums1.length && p2 < nums2.length){
			if(nums1[p1] < nums2[p2]){
				p1++;
			}
			else if(nums1[p1] > nums2[p2]){
				p2++;
			}
			else{
				set.add(nums1[p1]);
				p1++;
				p2++;
			}
		}
		int i = 0;
		int res[] = new int[set.size()];
		for (Integer integer : set) {
			res[i] = integer;
			i++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		IntersectionOfTwoArrays  IOT = new IntersectionOfTwoArrays();
		int[] res =IOT.intersection(new int[]{1,2,3,3},new int[]{2,3});
		for (int i : res) {
			System.out.println(i);
		}
	}
}
