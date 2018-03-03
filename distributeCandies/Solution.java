package distributeCandies;

import java.util.HashSet;
import java.util.Set;

public class Solution {
public int distributeCandies(int[] candies) {
	Set<Integer> result=new HashSet<Integer>();
	for(int i=0;i<candies.length;i++) 
		result.add(candies[i]);
	return Math.min(candies.length/2, result.size());     
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] candies={1,1,2,2,3,3};
	System.out.println(s.distributeCandies(candies));
}
}
