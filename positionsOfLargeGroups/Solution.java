package positionsOfLargeGroups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
public List<List<Integer>> largeGroupPositions(String S) {
		List<Integer> list=new ArrayList<Integer>();
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        int begin=0,end=0;
        for(int i=0;i<S.length()-1;){
        	while(i<S.length()-1&&S.charAt(i)==S.charAt(i+1)){
        		end++;
        		i++;
        	}
        	if(end-begin>=2)
        		result.add(Arrays.asList(begin,end));       	
				i++;
        		begin=i;
				end=begin;
        }
        return result;
    }
public static void main(String[] args){
	Solution s=new Solution();
	String str="abcdddeeeeaaeeeerrrr";
	List<List<Integer>> l=s.largeGroupPositions(str);
	for(List<Integer> i:l)
		for(Integer j:i)
			System.out.println(j);
}
}
