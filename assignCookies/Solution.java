package assignCookies;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g); 
       Arrays.sort(s);
       int j=0;
       int result=0;
       for(int i=0;i<s.length;){
    	   if(i<s.length&&j<g.length&&s[i]>=g[j]){
    		   result++;
    		   i++;
    	       j++;
    	   }
    	   else
    		   i++;
       }
    	return result;  
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] gg={1};
	int[] ss={0};
	System.out.println(s.findContentChildren(gg, ss));
}
}
