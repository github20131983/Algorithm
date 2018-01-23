package numberof1Bits;

public class Solution {
public int hammingWeight(int n) {
       int result=0;
       while(n!=0){
    	   result+=n&1;
    	   n>>>=1;
       }
       return result;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.hammingWeight(11));
}
}
