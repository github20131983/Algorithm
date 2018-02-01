package intersectionofTwoArraysII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hs=new HashMap<Integer,Integer>();
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
        	if(hs.containsKey(nums1[i]))
        		hs.put(nums1[i],hs.get(nums1[i])+1);
        	else
        		hs.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
        	if(hs.containsKey(nums2[i])&&hs.get(nums2[i])>0){
        		l.add(nums2[i]);
        		hs.put(nums2[i], hs.get(nums2[i])-1);
        	}        			 
        }
        int count=0;
        int[] result = new int[l.size()];
        for(int a:l)
        	result[count++]=a;
        return result;
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] a={4,7,9,7,6,7};
	int[] b={5,0,0,6,1,6,2,2,4};
	int[] c=s.intersect(a, b);
	for(int i:c)
		System.out.println(i);
}
}
