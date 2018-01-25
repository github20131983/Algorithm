package isomorphicStrings;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
	 public boolean isIsomorphic(String s, String t) {
	  if(isIsomorphicHelp(s,t)&&isIsomorphicHelp(t,s))
		  return true;
	  return false;
	    }
	 public boolean isIsomorphicHelp(String s,String t){
		 HashMap<Character,Character> mp=new HashMap<Character,Character>();
		  HashSet<Character> hs=new HashSet<Character>();
		    for(int i=0;i<t.length();i++){
		    	if(hs.contains(t.charAt(i))&&s.charAt(i)!=mp.get(t.charAt(i)))
		    		return false;
		    	hs.add(t.charAt(i));
		    	mp.put(t.charAt(i),s.charAt(i));
		    }	 
		    return true;
	 }
	 public static void main(String[] args){
		 HashMap<Character,Character> mp=new HashMap<Character,Character>();
		 Solution s=new Solution();
		 String a="egg";
		 String b="add";
		 System.out.println(s.isIsomorphic(a, b));
	 }
}
