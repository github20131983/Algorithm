package findAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	 public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++)
			if(nums[Math.abs(nums[i])-1]>0)
			   nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
		for(int i=0;i<nums.length;i++)
			if(nums[i]>0)
			    result.add(i+1);
		return result;	        
	    }
	 public static void main(String[] args){
		 Solution s=new Solution();
		 int[] n={4,3,2,7,8,2,3,1};
		 List<Integer> l=s.findDisappearedNumbers(n);
		 for(Integer i:l)
			 System.out.println(i);
	 }
}
