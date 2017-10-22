package reverseInteger;

public class Solution {
	public int reverse(int x) {
	    
        int result=0;
	    while(x!=0){
	    	int tail=x%10;
	    	int temp=result*10+tail;
	    	if((temp-tail)/10!=result)
	    		{return 0;}
	    	result=temp;
	    	x=x/10;
	    }
	    return result;
	}
 
  public static void main(String[] args){
	  Solution s=new Solution();
	  System.out.println(s.reverse(-123456888));
  }
}
