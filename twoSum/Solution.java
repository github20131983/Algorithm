package twoSum;

import java.util.HashMap;
import java.util.Map;
// map<key,value>
public class Solution {
  public int[] twoSum(int[] nums, int target){
	  int result[]=new int[2];
	  Map<Integer,Integer>  map=new HashMap<Integer,Integer>();
	  for(int i=0;i<nums.length;i++){
		  if(map.containsKey(target-nums[i])){
			  result[0]=map.get(target-nums[i]);
			  result[1]=i;
			  return result;
		  }
		  map.put(nums[i],i);
	  }
	return result;	  
  }
  public static void main(String[] args){
	  Solution s=new Solution();
	  int a[]={2,7,11,5};
	  for(int i=0;i<s.twoSum(a, 7).length;i++)
	  System.out.println(s.twoSum(a, 7)[i]);
  }
}
