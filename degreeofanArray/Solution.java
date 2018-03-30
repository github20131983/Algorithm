package degreeofanArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	
    public int findShortestSubArray(int[] nums) {
    	int degree=-1,minSize=nums.length;
    	Map<Integer,Integer[]> numPositionAndFrequency=new HashMap<Integer,Integer[]>();
    	for(int i=0;i<nums.length;i++){
    		if(numPositionAndFrequency.get(nums[i])==null)
    			numPositionAndFrequency.put(nums[i], new Integer[3]);
    		Integer[] numRange = numPositionAndFrequency.get(nums[i]);
            if (numRange[0] == null) numRange[0] = i;
            numRange[1] = i;
            numRange[2]=numRange[2]==null?0:numRange[2]+1;
            degree=Math.max(degree,numPositionAndFrequency.get(nums[i])[2]);
    	}
    	for (Entry<Integer, Integer[]> entry : numPositionAndFrequency.entrySet()) {
            if (entry.getValue()[2] != degree) continue;
            Integer[] range = numPositionAndFrequency.get(entry.getKey());
            minSize = Math.min(minSize, range[1] - range[0] + 1);  
        }
    	return minSize;
    }

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] a={1, 2, 2, 3, 1, 4, 2};
		System.out.println(s.findShortestSubArray(a));
	}

}
