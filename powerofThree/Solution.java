package powerofThree;

public class Solution {
public boolean isPowerOfThree(int n) {
	return (n>0&&1162261467%n==0);       
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.isPowerOfThree(27));
}
}
