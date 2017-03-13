package edu.hubu.leetCode;

/**
 * ���������ļӷ�(������+��-�����)
 * ÿһλ�ļӷ�����������������õ�
 * �����λ������������
 * @author sucan
 *
 */

public class TwoIntegerSums {
	public int getSum(int a,int b){
		
		/**
		 * 
		 */
		while(b != 0){
		int carry = a & b;//�õ���λ
		a = a^b;
		b = carry << 1;
		}
		return a;
	}
	
	public static void main(String[] args) {
		TwoIntegerSums sum = new TwoIntegerSums();
		System.out.println(sum.getSum(2,3));
	}
}
