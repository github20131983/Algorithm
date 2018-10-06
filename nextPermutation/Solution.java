package nextPermutation;

import java.util.Arrays;

public class Solution {
	public void nextPermutation(int[] nums) {
		int place=0;
        for(int i=nums.length-2;i>=0;i--)
        	if(nums[i]<nums[i+1]){
        		place=i;
        		break;
        	}
        swap(place,nums);
        Arrays.sort(nums,place+1,nums.length);
    }
	public void swap(int place,int[] nums){
		int pos=nums.length-1,min=Integer.MAX_VALUE;
		for(int i=nums.length-1;i>=place;i--)
			if(nums[i]<min&&nums[i]>nums[place]){
				min=nums[i];
				pos=i;
			}
			int temp=nums[place];
			nums[place]=nums[pos];
			nums[pos]=temp;		
	}
	public static void main(String[] args){
		Solution s=new Solution();
		int[] test={2,3,1};
		s.nextPermutation(test);
		for(int i:test)
			System.out.print(i+" ");
	}
}
