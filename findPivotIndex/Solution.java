package findPivotIndex;

public class Solution {
public int pivotIndex(int[] nums) {
	   int sum=0,left=0;
	   for(int num:nums)sum+=num;
	   for(int i=0;i<nums.length;i++){
		   if (i!=0) left+=nums[i-1];
           if (sum-nums[i]==left*2) return i;
	   }
		   return -1;
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] nums={-1,-1,0,1,1,0};
	System.out.println(s.pivotIndex(nums));
}
}
