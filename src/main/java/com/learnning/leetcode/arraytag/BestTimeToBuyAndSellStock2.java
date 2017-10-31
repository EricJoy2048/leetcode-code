package com.learnning.leetcode.arraytag;

public class BestTimeToBuyAndSellStock2 {
	public int maxProfit(int[] prices) {
        int profix = 0;
        int tmp_profix = 0;
        for(int i = 0 ; i < prices.length ; i++){
            if(i != 0){
                tmp_profix = prices[i] - prices[i-1];
                if(tmp_profix > 0){
                    profix += tmp_profix;
                }
            }
        }
        
        return profix;
    }
}
