package removeDuplicatesFromSortedArrayII;

public class Solution {
	public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n:nums)
        	if(i<2||n>nums[i-2])
        		nums[i++]=n;
        return i;
    }
	public static void main(String[] args){
		Solution s=new Solution();
		int[] nums={1,1,1,2,2,3,4,5,5,6};
		s.removeDuplicates(nums);
		for(int num:nums)
			System.out.print(num+" ");
	}
}
