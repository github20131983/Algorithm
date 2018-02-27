package reverseStringII;

public class Solution {
public String reverseStr(String s, int k) {
	boolean ifReverse=true;
	int endStr;
	StringBuilder reverseStr=new StringBuilder();
	for(int i=0;i<s.length();i+=k){
		endStr=(i+k)>s.length()?s.length():i+k;
		if(ifReverse){		
			reverseStr=reverseStr.append(new StringBuilder(s.substring(i,endStr)).reverse());			
			ifReverse=false;			
		}
		else{	
			reverseStr=reverseStr.append(s.substring(i,endStr));
			ifReverse=true;	
		}
	}
	return reverseStr.toString();       
    }
public static void main(String[] args){
	String str="a";
	Solution s=new Solution();
	System.out.println(s.reverseStr(str, 3));
}
}
