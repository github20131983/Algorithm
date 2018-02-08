package longestPalindrome;

import java.util.Arrays;

public class Solution {
public int longestPalindrome(String s) {
       int[] sArrayLower=new int[26];
       int[] sArrayUpper=new int[26];
       Arrays.fill(sArrayLower,0);
       Arrays.fill(sArrayUpper,0);
       int count=0;
       for(int i=0;i<s.length();i++){
    	   if(s.charAt(i)>='a'&&s.charAt(i)<='z')
    		   sArrayLower[s.charAt(i)-'a']++;
    	   if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
    		   sArrayUpper[s.charAt(i)-'A']++;
       }
    	for(int i=0;i<26;i++)
    		count+=sArrayLower[i]/2+sArrayUpper[i]/2;
    	    count*=2;
    	if(count<s.length())count++;
    	return count;    	   
    }
public static void main(String[] args){
	Solution s=new Solution();
	String str="aaaAaaaa";
	System.out.println(s.longestPalindrome(str));	
}
}
