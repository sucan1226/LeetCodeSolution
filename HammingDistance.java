package edu.hubu.leetCode;

/**
 * 求汉明距离
 * 也就是，对应二进制位数不同的个数
 * leetCode 461
 * @author sucan
 *
 */

public class HammingDistance {
	
	public int hammingDistance(int x, int y) {
			int distance = 0;
			for(int i = 0;i < 32;i++){
				int val = 1 << i;
				if(val > x && val > y){
					break;
				}
				if((val & x) != (val & y)){
					distance++;
				}
			}
			return distance;
	    }
	public static void main(String[] args) {
		int len = new HammingDistance().hammingDistance(2, 5);
		System.out.println(len);
	}
}
