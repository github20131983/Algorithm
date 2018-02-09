package thirdMaximumNumber;

import java.util.Arrays;

public class Solution {
public int thirdMax(int[] nums) {
        Integer first=null;
        Integer second=null;
        Integer third=null;
        for(Integer n:nums){
        	if(n.equals(first)||n.equals(second)||n.equals(third))
        		continue;
        	if(first==null||n>first){
        		third=second;
        		second=first;
        		first=n;
        	}
        	else if(second==null||n>second){
        		third=second;
        		second=n;
        	}
        	else if(third==null||n>third)
        		third=n;        	
        }
        return third==null?first:third;
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] a={2,2,3,1};
	System.out.println(s.thirdMax(a));
}
}
