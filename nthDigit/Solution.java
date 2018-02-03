package nthDigit;

public class Solution {
public int findNthDigit(int n) {
        int len=1;
        long base=9;
        int start=1;
        while(n>len*base){
        	n-=len*base;
        	len++;
        	base*=10;
        	start*=10;
        }
        start+=(n-1)/len;
        String s=Integer.toString(start);        
        return s.charAt((n-1)%len)-'0';
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.findNthDigit(2147483647));
}
}
