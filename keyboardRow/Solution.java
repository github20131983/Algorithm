package keyboardRow;

import java.util.ArrayList;
import java.util.List;

public class Solution {
public String[] findWords(String[] words) {
	List<String> l=new ArrayList<String>();
	for(String word:words)
		if(word.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
				l.add(word);				
	return (String[]) l.toArray(new String[l.size()]);        
    }
public static void main(String[] args){
	Solution s=new Solution();
	String[] words={"Hello", "Alaska", "Dad", "Peace"};
	String[] str=s.findWords(words);
	for(String word:str)
		System.out.println(word);
		
}
}
