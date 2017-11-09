package climbingStairs;

public class Solution {
	 public int climbStairs(int n) {
	        int[] f=new int[n+1];
	        f[1]=1;
	        if(n>=2){
	        f[2]=2;
	        for(int i=3;i<n+1;i++)
	        	f[i]=f[i-1]+f[i-2];
	        }
	        return f[n];
	    }
	 public static void main(String[] args){
		 Solution s=new Solution();
		 System.out.println(s.climbStairs(1));
	 }
}
