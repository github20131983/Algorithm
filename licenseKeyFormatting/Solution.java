package licenseKeyFormatting;

public class Solution {
public String licenseKeyFormatting(String S, int K) {	  
      StringBuilder s= new StringBuilder();;
      for(int i=0;i<S.length();i++){
    	  if('a'<=S.charAt(i)&&S.charAt(i)<='z')
    		  s.append((char)(S.charAt(i)-'a'+'A'));
    	  else if('A'<=S.charAt(i)&&S.charAt(i)<='Z')
    		  s.append(S.charAt(i));
    	  else if('0'<=S.charAt(i)&&S.charAt(i)<='9')
    		  s.append(S.charAt(i));
      }
      int firstSegment=s.length()%K;
      StringBuilder result= new StringBuilder(s.substring(0,firstSegment));
      for(int i=firstSegment;i<s.length();i+=K){
    	  if(i==0)
    		  result.append(s.substring(i,i+K));
    	  else
    	  result.append("-"+s.substring(i,i+K));
      }
     return result.toString();  	  
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.licenseKeyFormatting("iiii",4));
}
}
