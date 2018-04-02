package largestNumberAtLeastTwiceofOthers;

public class Solution {
public int dominantIndex(int[] nums) {
        if(nums.length==1)return 1;
        int max=Math.max(nums[0], nums[1]);
        int secondMax=Math.min(nums[0], nums[1]);
        int maxIndex=nums[0]>nums[1]?0:1;
        for(int i=2;i<nums.length;i++){
        	if(nums[i]>max){
        		secondMax=max;
        		max=nums[i];
        		maxIndex=i;
        	}
        	else if(nums[i]>secondMax&&nums[i]<max){
        		secondMax=nums[i];
        	}
        }
        return 2*secondMax<=max?maxIndex:-1;
        }
public static void main(String[] args){
	Solution s=new Solution();
	int[] test={1,2,3,4};
	System.out.println(s.dominantIndex(test));
}
}
