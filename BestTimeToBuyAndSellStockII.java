package edu.hubu.leetCode;

/**
 * LeetCode 122
 * 用一个数组表示股票每天的价格，数组的第i个数表示股票在第i天的价格。如果只允许一次交易
 * 也就是说只允许买一支股票并卖掉，求最大的利益。
 * 
 * 贪心算法。
 * 每次找到波谷和波峰相减就可以了
 * 如果i天买进,j天卖出。那么，如果j+1 > j 的话，我们理当j+1天的时候卖出
 * dans如果i-1 < i。那么，理当i-1天的时候买进
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
