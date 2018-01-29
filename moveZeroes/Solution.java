package moveZeroes;

public class Solution {
	 public void moveZeroes(int[] nums) {
	        int before=0,after=0;
	        int i=0;
	        while(nums[i]!=0&&i<nums.length-1)
	        	i++;
	        before=i;
	        while(i<nums.length-1){	        
	        while(nums[i]==0&&i<nums.length-1)
	        	i++;
	            after=i;
	            nums[before]=nums[after];
	            nums[after]=0;
	            before++;
	        }
	    }
	 public static void main(String[] args){
		 int[] a={1};
		 Solution s=new Solution();
		 s.moveZeroes(a);
		 for(int m:a)
			 System.out.println(m);
			 
	 }
}
