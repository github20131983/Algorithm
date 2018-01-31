package reverseString;

public class Solution {
	 public String reverseString(String s) {
		    int n=s.length();
		    char[] sArray=s.toCharArray();
	        for(int i=0;i<n/2;i++){
	        	char temp;
	        	temp=sArray[i];
	        	sArray[i]=sArray[n-i-1];
	        	sArray[n-i-1]=temp;
	        }	
	        return new String(sArray);
	    }
	 public static void main(String[] args){
		 Solution s=new Solution();
		 System.out.println(s.reverseString(""));
	 }
}
