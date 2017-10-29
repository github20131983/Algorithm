package removeDuplicatesfromSortedArray;

public class Solution {
public int removeDuplicates(int[] nums) {
        if(nums.length<2)return nums.length;
        int n=1;
        for(int i=0;i<nums.length-1;i++){
        	if(nums[i]!=nums[i+1])
        		nums[n++]=nums[i+1];
        }
        /*for(int i=0;i<n;i++){
       		System.out.println(nums[i]);
        }*/
        return n;
        
    }
 
  public static void main(String[] args){
	  Solution s=new Solution();
	  int[] s1={1,1,2,2,3,3,3,3};	  
	  System.out.println(s.removeDuplicates(s1));
  }
}
