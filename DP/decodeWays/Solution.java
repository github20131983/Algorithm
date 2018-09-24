package decodeWays;

public class Solution {
	 public int numDecodings(String s) {
	        if(s==null) return 0;
	        int n=s.length();
	        int[] temp=new int[n+1];
	        temp[n]=1;
	        temp[n-1]=s.charAt(n-1)=='0'?0:1;
	        for(int i=n-2;i>=0;i--){
	        	if(s.charAt(i)=='0')
	        		continue;
	        	else 
	        		temp[i]=(Integer.parseInt(s.substring(i,i+2))<=26)?temp[i+1]+temp[i+2]:temp[i+1];
	        }
	        return temp[0];
	  }
	 public static void main(String[] args){
		 Solution s=new Solution();
		 System.out.println(s.numDecodings("1234056"));
	 }
}
