package arrangingCoins;

public class Solution {
public int arrangeCoins(int n) {
	   int left=1;
	   int right=n;
       while(left<=right){
    	   long middle=left+(right-left)/2;
    	   long row1=(middle+1)*middle/2;
    	   long row2=(middle+1)*(middle+2)/2;
    	   if((row1<n&&row2>n)||row1==n)
    		   return (int) middle;
    	   else if(row1>n)
    	      right=(int) (middle-1);
    	   else if(row1<n)
    		  left=(int) (middle+1);
       }
       return left;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.arrangeCoins(1804289383));
}
}
