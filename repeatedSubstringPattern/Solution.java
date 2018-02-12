package repeatedSubstringPattern;

public class Solution {
public boolean repeatedSubstringPattern(String s) {
       for(int i=s.length()/2;i>0;i--){
    	   if(s.length()%i==0){
    		   int length=s.length()/i;
    		   String subs=s.substring(0, i);
    		   int j;
    		   for(j=1;j<length;j++)
    		   if(!subs.equals(s.substring(j*i,(j+1)*i)))
    			   break;
    		   if(j==length)
    			   return true;
    	   }  	   
       }
       return false;
    }
public static void main(String[] args){
	Solution s=new Solution();
	String str="abababa";
	System.out.println(s.repeatedSubstringPattern(str));
}
}
