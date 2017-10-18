package addBinary;

public class Solution {
  public String addBinary(String a,String b){
	  if(a==null||a.isEmpty())
		  return b;
	  if(b==null||b.isEmpty())
		  return a;
	  char aArray[]=a.toCharArray();
	  char bArray[]=b.toCharArray();
	  StringBuilder c=new StringBuilder();
	  
	  int aLength=a.length()-1;
	  int bLength=b.length()-1;
	  int aByte;
	  int bByte;
	  int result;
	  int carry=0;
	  
	  while(aLength>=0||bLength>=0||carry>0){
		  aByte=(aLength>=0)?Character.getNumericValue(aArray[aLength--]):0;
		  bByte=(bLength>=0)?Character.getNumericValue(bArray[bLength--]):0;
		  result=aByte^bByte^carry;
		  carry=(aByte+bByte+carry>1)?1:0;
		  c.append(result);
	  }
	
	  return c.reverse().toString();
  }
  public static void main(String[] args){
	  Solution s=new Solution();
	  System.out.println(s.addBinary("11", "11111"));
  }
}
