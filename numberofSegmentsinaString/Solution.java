package numberofSegmentsinaString;

public class Solution {
public int countSegments(String s) {
	   int count=0;
       for(int i=1;i<s.length();i++){
    	   if(s.charAt(i)!=' '&&s.charAt(i-1)==' ')
    		   count++;
       }
       if(s.length()>0&&s.charAt(0)!=' ')count++;
       return count;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.countSegments(""));
}
}
