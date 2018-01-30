package wordPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
	 public boolean wordPattern(String pattern, String str) {
		    char[] patternArray=pattern.toCharArray();
		    String[] strArray=str.split(" ");
		    if(patternArray.length!=strArray.length)
		    	return false;
		    Map mp=new HashMap();
		    for(int i=0;i<patternArray.length;i++){		    	
		    		if(!Objects.equals(mp.putIfAbsent(patternArray[i],i),(mp.putIfAbsent(strArray[i],i))))
		    			//注意放的不是int，是Integer	,小于127时从缓存取数，是同一个对象，大于127新建，不是同一个对象，所以后来的不一样了	    	   
		    		return false;
		    }
	        return true;
	    }
	 public static void main(String[] args){
		 String p="ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
		 String ss="s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
		 /*String p="aba";
		 String ss="dog cat dog";*/
		 Solution s=new Solution();
		 System.out.println(s.wordPattern(p, ss));
	 }
}
