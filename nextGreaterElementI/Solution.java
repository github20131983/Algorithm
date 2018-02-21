package nextGreaterElementI;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
	Stack<Integer> st=new Stack<Integer>();
	for(int num:nums2){
		while(!st.empty()&&st.peek()<num)
			mp.put(st.pop(),num);	
		st.push(num);
	}
	for(int i=0;i<nums1.length;i++)
		nums1[i]=mp.getOrDefault(nums1[i], -1);
	return nums1;	        
}
public static void main(String[] args){
	Solution s=new Solution();
	int[] nums1={4,1,2};
	int[] nums2={1,3,4,2};
	int[] a=s.nextGreaterElement(nums1, nums2);
	for(int i:a)
	   System.out.println(i);
}
}
