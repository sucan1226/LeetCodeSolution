package edu.hubu.leetCode;

/**
 * LeetCode 122
 * ��һ�������ʾ��Ʊÿ��ļ۸�����ĵ�i������ʾ��Ʊ�ڵ�i��ļ۸����ֻ����һ�ν���
 * Ҳ����˵ֻ������һ֧��Ʊ�����������������档
 * 
 * ̰���㷨��
 * ÿ���ҵ����ȺͲ�������Ϳ�����
 * ���i�����,j����������ô�����j+1 > j �Ļ���������j+1���ʱ������
 * dans���i-1 < i����ô����i-1���ʱ�����
 * @author sucan
 *
 */

public class BestTimeToBuyAndSellStockII {
	public int maxProfit(int[] prices){
		int maxProfit = 0;
		for(int i = 0;i < prices.length-1;i++){
			if(prices[i+1] - prices[i] > 0){
				maxProfit = maxProfit + prices[i+1] - prices[i];
			}
		}
		return maxProfit;
	}
}
