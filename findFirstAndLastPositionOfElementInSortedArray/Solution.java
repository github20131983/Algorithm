package findFirstAndLastPositionOfElementInSortedArray;

public class Solution {
	public int[] searchRange(int[] nums, int target) {
		if(nums.length==0)return new int[]{-1,-1};
		int start=-1,end=-1;
		int left=0,right=nums.length-1;
		while(left<=right){
			int mid=left+(right-left)/2;
			if(nums[mid]<target)left=mid+1;
			else right=mid-1;
		}
		if(left<=nums.length-1&&nums[left]==target)start=left;
		left=0;
		right=nums.length-1;
		while(left<=right){
			int mid=left+(right-left)/2;
			if(nums[mid]<=target)left=mid+1;
			else right=mid-1;
		}
		if(right>=0&&nums[right]==target)end=right;
		return new int[]{start,end};     
    }
	public static void main(String[] args){
		Solution s=new Solution();
		int[] test={2,2};
		System.out.println(s.searchRange(test, 3)[0]);
		System.out.println(s.searchRange(test, 3)[1]);
	}
}
