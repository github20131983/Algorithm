package factorialTrailingZeroes;

public class Solution {
public int trailingZeroes(int n) {
        int result=0;
        while(n>0){
        	result+=n/5;
        	n=n/5;
        }
        return result;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.trailingZeroes(125));
}
}
