package zigZagConversion;

import java.util.Arrays;

public class Solution {
	public String convert(String s, int numRows) {
		if(numRows==1)return s;
        String[] str=new String[numRows];
        Arrays.fill(str,"");
        String res="";
        int[] sig=new int[2*numRows-2];
        for(int i=1;i<numRows;i++)
        	sig[i]=sig[2*(numRows-1)-i]=i;
        for(int i=0;i<s.length();i++)
        	str[sig[i%(2*numRows-2)]]+=s.charAt(i); 
        for(int i=0;i<str.length;i++)
        	res+=str[i];
		return res;
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.convert("A", 1));
	}
}
