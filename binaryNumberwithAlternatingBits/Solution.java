package binaryNumberwithAlternatingBits;

public class Solution {
	 public boolean hasAlternatingBits(int n) {
	        n^=n>>2;
	        return ((n&(n-1))==0);
	    }
	public static void main(String[] args) {
	 Solution s=new Solution();
	 System.out.println(s.hasAlternatingBits(10));
	}

}
