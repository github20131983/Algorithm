package searchInRotatedSortedArray;

public class Solution {
	public int search(int[] nums, int target) {
		if(nums.length==0)return -1;
		int min=findMin(nums);
		int left=0,right=nums.length-1;
		if(target>nums[nums.length-1])
			right=min-1;
		else 
			left=min;
		while(left<=right){
			int mid=left+(right-left)/2;
			if(nums[mid]==target)return mid;
			else if(nums[mid]>target)right=mid-1;
			else left=mid+1;
		}	
		return -1;
    }
	public int findMin(int[] nums){
		int left=0,right=nums.length-1;
		while(left<right){
			int mid=left+(right-left)/2;
			if(nums[mid]>nums[right])left=mid+1;
			else right=mid;
		}
		return left;
	}
	public static void main(String[] args){
		Solution s=new Solution();
		int[] test={};
		System.out.print(s.search(test,5));
	}
}
