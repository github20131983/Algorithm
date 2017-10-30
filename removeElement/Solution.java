package removeElement;

public class Solution {
public int removeElement(int[] nums, int val) {
        int k=nums.length-1;
        for(int j=0;j<k+1;j++){
        	if(nums[j]==val)
        		{nums[j--]=nums[k--];}
        }
        for(int j=0;j<k+1;j++)
        	System.out.print(nums[j]+" ");
        return k+1;
        
    }
 
  public static void main(String[] args){
	  Solution s=new Solution();
	 int[] a={3,2,2,3};
	
	  System.out.println( s.removeElement(a, 2));
  }
}
