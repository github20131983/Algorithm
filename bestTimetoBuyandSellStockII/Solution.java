package bestTimetoBuyandSellStockII;

public class Solution {
public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0)
        	return 0;
    	int profit=0;
        for(int i=1;i<prices.length;i++){
        	int diff=prices[i]-prices[i-1];
        	if(diff>0)
        		profit+=diff;
        }
        return profit;
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] result1={7,1,5,3,6,4};
	int[] result2={7,6,4,3,1};
	System.out.println(s.maxProfit(result1));
	System.out.println(s.maxProfit(result2));
}
}
