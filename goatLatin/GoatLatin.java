package goatLatin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GoatLatin {
public String toGoatLatin(String S) {
	    Character[] vowelList={'a','e','i','o','u','A','E','I','O','U'};
	    Set<Character> vowes=new HashSet<Character>(Arrays.asList(vowelList));
	    StringBuilder res = new StringBuilder();
	    int count=1;
        for(String word:S.split(" ")){
        	char firstCharacter=word.charAt(0);
        	if(count!=1)res.append(" ");
        	if (vowes.contains(firstCharacter))
        		res.append(word);
        	else {
				res.append(word.substring(1));
				res.append(firstCharacter);
			}
        	res.append("ma");
        	for(int i=0;i<count;i++)
        		res.append("a");
        	count++;
        }
        return res.toString();
    }
public static void main(String[] args){
	GoatLatin gl=new GoatLatin();
	System.out.println(gl.toGoatLatin("I speak Goat Latin"));
}
}
