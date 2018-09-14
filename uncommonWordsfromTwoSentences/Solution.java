package uncommonWordsfromTwoSentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
public String[] uncommonFromSentences(String A, String B) {
		String[] aToArray=A.split(" ");
		String[] bToArray=B.split(" ");
        Map<String,Integer> map=new HashMap<String, Integer>();
        List<String> list=new ArrayList<String>();
        for(int i=0;i<aToArray.length;i++)
        	map.put(aToArray[i],map.getOrDefault(aToArray[i],0)+1);
        for(int i=0;i<bToArray.length;i++)
        	map.put(bToArray[i],map.getOrDefault(bToArray[i], 0)+1);
        for(String str:map.keySet())
        	if(map.get(str)==1)
        		list.add(str);
        return list.toArray(new String[list.size()]);	
    }
public static void main(String[] args){
	Solution s=new Solution();
	String[] res=s.uncommonFromSentences("this apple is sweet", "this apple is sour");
	for(String str:res)
		System.out.print(str);
}
}
