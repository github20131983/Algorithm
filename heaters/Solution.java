package heaters;

import java.util.Arrays;

public class Solution {
public int findRadius(int[] houses, int[] heaters) {
	Arrays.sort(houses);
	Arrays.sort(heaters);
	int radius=0;
	int j=0;
	for(int i=0;i<houses.length;i++){
		while(j<heaters.length-1&&heaters[j]+heaters[j+1]<=2*houses[i])
			j++;
		radius=Math.max(radius, Math.abs(heaters[j]-houses[i]));
	}	
	return radius;        
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] ho={1,2,3};
	int[] he={2};
	System.out.println(s.findRadius(ho, he));
}
}
