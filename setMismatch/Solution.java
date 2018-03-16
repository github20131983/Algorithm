package setMismatch;

public class Solution {
	 public int[] findErrorNums(int[] nums) {
	        int[] result=new int[2];
	        for(int i:nums){
	        	if(nums[Math.abs(i)-1]<0)result[0]=Math.abs(i);
	        	else nums[Math.abs(i)-1]=-nums[Math.abs(i)-1];
	        }
	        for(int i=0;i<nums.length;i++)
	        	if(nums[i]>0)result[1]=i+1;
	        return result;
	    }	
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] a={3,4,4,2,1};
		int[] res=s.findErrorNums(a);
		System.out.print(res[0]+" "+res[1]);
	}

}
