package missingNumber;

public class Solution {
public int missingNumber(int[] nums) {
	   int result=0;
       for(int i=0;i<nums.length;i++){
    	  result^=i;
    	  result^=nums[i];
       }
       return result^nums.length;
    }
public static void main(String[] args){
	int[] a={3,0,1,2,5};
	Solution s=new Solution();
	System.out.println(s.missingNumber(a));
}
}
