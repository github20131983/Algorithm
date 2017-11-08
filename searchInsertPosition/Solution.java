package searchInsertPosition;

public class Solution {
	 public int searchInsert(int[] nums, int target) {
	       int left=0;
	        int right=nums.length-1;
	        int middle;
	        while(right>=left){
	        	middle=left+((right-left)>>1);
	        	if(nums[middle]==target)
	        		return middle;
	        	else if(nums[middle]<target)
	        		left=middle+1;
	        	else
	        		right=middle-1;
	        }
		return left;  
	    }
  public static void main(String[] args){
	 Solution s=new Solution();
	 int[] a={1,3,5,6};
	 int b=5;
	 System.out.println(s.searchInsert(a, b));
  }
}
