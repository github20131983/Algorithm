package longestContinuousIncreasingSubsequence;

public class Solution {
public int findLengthOfLCIS(int[] nums) {
	    if (nums.length==0) return 0;
        int max=1;
        int count=1;
        for(int i=1;i<nums.length;i++){
        	if(i<nums.length&&nums[i]>nums[i-1]){
        		count++;
        	    if(count>max)max=count;
        	}
        	else
        		count=1;
        }
        return max;
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] a={2};
		System.out.println(s.findLengthOfLCIS(a));
	}

}
