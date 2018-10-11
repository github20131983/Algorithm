package groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
        	char[] arrayStr=str.toCharArray();
        	Arrays.sort(arrayStr);
        	String keyStr=String.valueOf(arrayStr);
        	if(!map.containsKey(keyStr))map.put(keyStr,new ArrayList<String>());
        	map.get(keyStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
	public static void main(String[] args){
		Solution s=new Solution();
		String[] str={};
		System.out.println(s.groupAnagrams(str));
	}
}
