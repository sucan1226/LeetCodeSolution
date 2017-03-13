package edu.hubu.leetCode;

/**
 * leetCode 338
 * ����һ��num��0-num֮�������ÿһ�����Ķ�����1�ĸ���
 * @author sucan
 *
 */

public class CountingBits {
	public int[] countBits(int num){
		//�������ĳ���Ϊnum+1
		int[] res = new int[num+1];
		for(int i = 1;i <= num;i++){
			//��ǰ����Ԫ�أ�Ӧ�õ���i����һλ��ӦԪ��+i��1����(�ж�ĩβ�ǲ���1)
			res[i] = res[i >> 1] + (i&1);
		}
		return res;
	}
}
