package arrayPartitionI;

import java.util.Arrays;

public class Solution {
public int arrayPairSum(int[] nums) {
	Arrays.sort(nums);
	int result=0;
	for(int i=0;i<nums.length;i+=2)
		result+=nums[i];
	return result;        
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] a={1,2,3,4};
	System.out.print(s.arrayPairSum(a));
}
}
