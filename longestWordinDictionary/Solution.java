package longestWordinDictionary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public String longestWord(String[] words) {
    	Arrays.sort(words);
		Set<String> set=new HashSet<String>();
		String result="";
		for(String word:words){
			if(word.length()==1||set.contains(word.substring(0,word.length()-1))){
				result=word.length()>result.length()?word:result;
				set.add(word);
			}			
		}
		return result;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		String[] words={"a", "ba", "app", "appl", "ap", "apply", "apple"};
		System.out.println(s.longestWord(words));
	}
}
