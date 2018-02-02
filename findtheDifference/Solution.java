package findtheDifference;

public class Solution {
public char findTheDifference(String s, String t) {	    
	    char c=0;
        for(int i=0;i<s.length();i++)
        	c^=s.charAt(i);
        for(int i=0;i<t.length();i++)
        	c^=t.charAt(i);
        return c;
    }
public static void main(String[] args){
	String s="wwy";
	String t="yeww";
	Solution ss=new Solution();
	System.out.println(ss.findTheDifference(s, t));
}
}
