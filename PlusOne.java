package edu.hubu.leetCode;

/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

   You may assume the integer do not contain any leading zero, except the number 0 itself.

   The digits are stored such that the most significant digit is at the head of the list.
 * @author sucan
 *
 */

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int i = digits.length-1;
        for(;i >= 0;--i){
        	digits[i] += 1;
        	if(digits[i] >= 10){
        		digits[i] -= 10;
        	}else{
        		break;
        	}
        }
        if(i < 0){
        	int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }else{
        	return digits;
        }
    }
}
