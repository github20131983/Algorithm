package minimumMovestoEqualArrayElements;

public class Solution {
public int minMoves(int[] nums) {
	if(nums.length==0)return 0;
	int result=0;
	int min=nums[0];
	for(int i=1;i<nums.length;i++)
		if(nums[i]<min)
			min=nums[i];
	for(int i:nums)
		result+=i-min;
	return result;        
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] a={1,2,3,4};
	System.out.println(s.minMoves(a));
}
}
