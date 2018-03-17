package nondecreasingArray;

public class Solution {
public boolean checkPossibility(int[] nums) {
	boolean flag=false;
	for(int i=1;i<nums.length;i++)
		if(nums[i]<nums[i-1]){
			if(flag)return false;
			if(i-2<0||nums[i]>=nums[i-2])nums[i-1]=nums[i];
			else nums[i]=nums[i-1];
			flag=true;
		}	
	return true;       
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] a={4,2,3};
		System.out.println(s.checkPossibility(a));
	}

}
