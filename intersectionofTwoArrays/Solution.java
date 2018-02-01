package intersectionofTwoArrays;

import java.util.HashSet;
import java.util.Set;

public class Solution {
public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<Integer>();
        Set<Integer> s2=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++)
        	s1.add(nums1[i]);
        for(int i=0;i<nums2.length;i++)
        	if(s1.contains(nums2[i]))
        		s2.add(nums2[i]);
        int[] result=new int[s2.size()];
        int count=0;
        for(int num:s2)
        	result[count++]=num;
        return result;      
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] a={1,1,2,3,4,5};
	int[] b={1,3,5,8};
	int[] c=s.intersection(a, b);
	for(int i=0;i<c.length;i++)
	   System.out.println(c[i]);
}
}
