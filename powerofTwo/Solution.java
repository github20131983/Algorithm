package powerofTwo;

public class Solution {
public boolean isPowerOfTwo(int n) {
        return n>0&&(n&n-1)==0;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.isPowerOfTwo(32));
	System.out.println(s.isPowerOfTwo(31));
}
}
