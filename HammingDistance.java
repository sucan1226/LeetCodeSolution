package edu.hubu.leetCode;

/**
 * ��������
 * Ҳ���ǣ���Ӧ������λ����ͬ�ĸ���
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
