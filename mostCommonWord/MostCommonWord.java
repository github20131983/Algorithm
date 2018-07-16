package mostCommonWord;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
public String mostCommonWord(String paragraph, String[] banned) {
	    int max=0;
	    String result="";
        Set<String> setBanned=new HashSet<String>(Arrays.asList(banned));
        String[] arrayParagraph=paragraph.replaceAll("[^a-zA-Z ]","").toLowerCase().split(" ");
        Map<String, Integer> map=new HashMap<String, Integer>();
        for(String str:arrayParagraph){
        	if(setBanned.contains(str))continue;
        	  map.put(str,map.getOrDefault(str, 0)+1);
        	if(map.get(str)>=max){
        		result=str;
        		max=map.get(str);
        	}
        }
        return result;
    }
public static void main(String[] args){
	MostCommonWord mc=new MostCommonWord();
	String string="Bob hit a ball, the hit BALL flew far after it was hit.";
	String[] ban={"hit"};
	System.out.println(mc.mostCommonWord(string,ban));
}
}
