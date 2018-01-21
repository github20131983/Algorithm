package excelSheetColumnNumber;

public class Solution {
public int titleToNumber(String s) {
	    char[] arrsyS=s.toCharArray();
        int n=arrsyS.length-1;
        int result=0;
        for(int i=n;i>=0;i--)
        	result=(int)(result+(arrsyS[i]-'A'+1)*Math.pow(26,n-i));
        return result;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.titleToNumber("AZ"));
}
}
