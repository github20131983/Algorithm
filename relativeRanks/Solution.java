package relativeRanks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
public String[] findRelativeRanks(int[] nums) {
	int[][] pair = new int[nums.length][2];
    
    for (int i = 0; i < nums.length; i++) {
        pair[i][0] = nums[i];
        pair[i][1] = i;
    }
	Arrays.sort(pair, (a, b) -> (b[0]-a[0]));
	//Arrays.sort(pair, new IntComparator());
	//���������Ч����������һ���õ��� lambda���ʽ�������ڲ����
	String[] result=new String[nums.length];
    for(int i=0;i<nums.length;i++){    	 
		if (i == 0) {
             result[pair[i][1]] = "Gold Medal";
         }
         else if (i == 1) {
             result[pair[i][1]] = "Silver Medal";
         }
         else if (i == 2) {
             result[pair[i][1]] = "Bronze Medal";
         }
         else {
             result[pair[i][1]] = (i + 1) + "";
         }
    }
	return result;        
    }

public static void main(String[] args){
	Solution s=new Solution();
	int[] pair={10, 3, 8, 9, 4};
	String[] ss=s.findRelativeRanks(pair);	
	for(String t:ss)
		System.out.println(t);
}
}
