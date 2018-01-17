package bestTimetoBuyandSellStock;

public class Solution {
public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0)
        	return 0;
        int local=0;
        int global=0;
        for(int i=0;i<prices.length-1;i++){
        	local=Math.max(local+prices[i+1]-prices[i],0);
            global=Math.max(global, local);
        }
        return global;
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] result1={7,1,5,3,6,4};
	int[] result2={7,6,4,3,1};
	System.out.println(s.maxProfit(result1));
	System.out.println(s.maxProfit(result2));
}
}
