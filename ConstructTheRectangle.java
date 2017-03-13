package edu.hubu.leetCode;

/**
 * 求一个矩形的长和宽，
 * 要求 l >= w 并且 l-w尽可能最小
 */

import java.util.Iterator;

public class ConstructTheRectangle {
	/**
	 * 这种解法如果area很大 就算不出来
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
	 * 这种解法类似于线性规划
	 * 解法二
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
