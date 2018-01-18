package singleNumber;

public class Solution {
public int singleNumber1(int[] nums) {
      for(int i=1;i<nums.length;i++)
    	  nums[0]^=nums[i];
      return nums[0];
}
public static void main(String[] args){
	Solution s=new Solution();
	int[] a={1};
	System.out.println(s.singleNumber1(a));
}
}
