package addString;

public class Solution {
public String addStrings(String num1, String num2) {
	    if(num1==null||num1.isEmpty())
		   return num2;
	    if(num2==null||num2.isEmpty())
		   return num1;
	    char num1Array[]=num1.toCharArray();
	    char num2Array[]=num2.toCharArray();
	    StringBuilder c=new StringBuilder();
	    
	    int num1len=num1.length()-1;
	    int num2len=num2.length()-1;
	    int aSingle,bSingle;
	    int carry=0;	    
        int result;
        
        while(num1len>=0||num2len>=0||carry>0){
        	aSingle=(num1len>=0)?Character.getNumericValue(num1Array[num1len--]):0;
        	bSingle=(num2len>=0)?Character.getNumericValue(num2Array[num2len--]):0;
        	result=(aSingle+bSingle+carry)%10;
        	carry=(aSingle+bSingle+carry>=10)?1:0;
        	c.append(result);
        }
        return c.reverse().toString();
    }
 
  public static void main(String[] args){
	  Solution s=new Solution();
	  System.out.println(s.addStrings("1", "9"));
  }
}
