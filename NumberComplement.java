package edu.hubu.leetCode;

/**
 * Çó²¹Êı
 * @author sucan
 *
 */

public class NumberComplement {
	public int findComplement(int num) {
		int temp = num;
		int mask = 1;
		while(temp > 0){
			temp >>= 1;
			mask <<= 1;
		}
		return (num ^ (mask-1));
    }
	
	public static void main(String[] args) {
		System.out.println(new NumberComplement().findComplement(5));
	}
}
