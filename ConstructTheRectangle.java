package edu.hubu.leetCode;

/**
 * ��һ�����εĳ��Ϳ�
 * Ҫ�� l >= w ���� l-w��������С
 */

import java.util.Iterator;

public class ConstructTheRectangle {
	/**
	 * ���ֽⷨ���area�ܴ� ���㲻����
	 * @param area
	 * @return
	 */
	public int[] constructRectangle(int area){
		int[] result = new int[2];
		if(area == 1 ){
			result[0] = 1;
			result[1] = 1;
		}
		int temp = area;
		int x = 0;
		int y = 0;
		for(int i = area/2;i <= area;i++){
			for(int j = 1; j <= area/2;j++){
				if(i*j == area){
					if(i - j < temp){
						temp = i - j;
						x = i;
						y = j;
						break;
					}
				}
			}
		}
		result[0] = x;
		result[1] = y;
		return result;
	}
	
	/**
	 * ���ֽⷨ���������Թ滮
	 * �ⷨ��
	 * @param area
	 * @return
	 */
	public int[] constructRectangle1(int area){
		int result[] = new int[2];
		int areaSqrt = 	(int)Math.sqrt(area);
		while (area % areaSqrt != 0){
			areaSqrt -- ;
		}
		int l = area / areaSqrt;
		result[0] = l;
		result[1] = areaSqrt;
		return result;
	}
	
	
	
	public static void main(String[] args) {
		ConstructTheRectangle rectangle = new ConstructTheRectangle();
		int[] res = rectangle.constructRectangle1(9999998);
		for (int i : res) {
			System.out.println(i);
		}
		
	}
}
