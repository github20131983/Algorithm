package houseRobber;

public class Solution {
public int rob(int[] nums) {
	if(nums.length==0)return 0;
	if(nums.length==1)return nums[0];
	if(nums.length==2)return nums[1]>nums[0]?nums[1]:nums[0];
        int[] max=new int[3];
        max[0]=nums[0];
        max[1]=nums[1]>nums[0]?nums[1]:nums[0];
        for(int i=2;i<nums.length;i++){
        	if(max[0]+nums[i]>max[1])
        		max[2]=max[0]+nums[i];
        	else
        		max[2]=max[1];        	
        	max[0]=max[1];
        	max[1]=max[2];
        }
        return max[2];
    }
public static void main(String[] args){
	int[] a={1,2,3,4,1,8};
	Solution s=new Solution();
	System.out.println(s.rob(a));
}
}
