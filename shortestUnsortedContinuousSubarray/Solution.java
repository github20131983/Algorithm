package shortestUnsortedContinuousSubarray;

public class Solution {
public int findUnsortedSubarray(int[] nums) {
	int length=nums.length;
	int begin=-1,end=-2,max=nums[0],min=nums[length-1];
	for(int i=1;i<length;i++){
		max=Math.max(max, nums[i]);
		min=Math.min(min, nums[length-1-i]);
		if(max>nums[i])end=i;
		if(min<nums[length-1-i])begin=length-1-i;
	}
	return end-begin+1;       
    }
public static void main(String[] args){
	int[] a={2, 6, 4, 8, 10, 9, 15};
	Solution s=new Solution();
	System.out.print(s.findUnsortedSubarray(a));
}
}
