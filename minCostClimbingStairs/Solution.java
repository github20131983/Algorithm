package minCostClimbingStairs;

public class Solution {
public int minCostClimbingStairs(int[] cost) {
        int cost0=0,cost1=cost[1]>cost[0]?cost[0]:cost[1];
        int minCost=cost1;
        for(int i=2;i<cost.length;i++){
        	minCost=Math.min(cost0+cost[i-1],cost1+cost[i]);
        	cost0=cost1;
        	cost1=minCost;
        }
        return minCost;
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] test={1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
	System.out.println(s.minCostClimbingStairs(test));
}
}
