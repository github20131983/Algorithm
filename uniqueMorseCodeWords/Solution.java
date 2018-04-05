package uniqueMorseCodeWords;

import java.util.HashSet;
import java.util.Set;

public class Solution {
public int uniqueMorseRepresentations(String[] words) {
      String[] morse={".-","-...","-.-.","-..",".","..-.","--.",
    		  "....","..",".---","-.-",".-..","--","-.","---",
    		  ".--.","--.-",".-.","...","-","..-","...-",".--",
    		  "-..-","-.--","--.."}; 
      Set<String> set=new HashSet<String>();
      for(String word:words){
    	  String m="";
    	  for(char ch:word.toCharArray())
    		  m+=morse[ch-'a'];
    	  set.add(m);
      }
      return set.size();
    }
public static void main(String[] args){
	Solution s=new Solution();
	String[] strs={"gin", "zen", "gig", "msg"};
	System.out.println(s.uniqueMorseRepresentations(strs));
}
}
