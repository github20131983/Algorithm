package findAllAnagramsinaString;

import java.util.ArrayList;
import java.util.List;

public class Solution {
public List<Integer> findAnagrams(String s, String p) {
	List<Integer> result=new ArrayList<Integer>();
	for(int i=0;i<s.length()-p.length()+1;i++){
		if(isAnagrams(s.substring(i, i+p.length()),p))
			result.add(i);
	}  
	return result;
    }
public boolean isAnagrams(String s,String p){
	if(s==null||p==null)return false;
	int[] c=new int[26];
	for(int i=0;i<s.length();i++){
		c[s.charAt(i)-'a']++;
		c[p.charAt(i)-'a']--;
	}
	for(int i=0;i<c.length;i++){
		if(c[i]!=0)
			return false;
	}
	return true;	
}
public static void main(String[] args){
	Solution s=new Solution();
	String s1="asder";
	String s2="adres";
	System.out.println(s.isAnagrams(s1, s2));
	List<Integer> l=s.findAnagrams("cbaebabacd", "abc");
	for(Integer i:l)
		System.out.println(i);
}
}
