package largestPalindromeProduct;

public class Solution {
public int largestPalindrome(int n) {
	if(n==1)return 9;
	int upperbound=(int) (Math.pow(10, n)-1);
	int lowerbound=upperbound/10;
	int max=upperbound;
	boolean flag=false;
	long palindrome=0;
	while(!flag){
		palindrome=creatPalindrome(max);
		for(int j=upperbound;j>lowerbound;j--){
			if(palindrome/j>upperbound)
				break;
			if(palindrome%j==0){
				flag=true;
				break;
			}
		}
		max--;
	}
	System.out.println(palindrome);
	return (int)(palindrome%1337);        
    }
public long creatPalindrome(int n){
	return Long.parseLong(n+new StringBuilder().append(n).reverse().toString());
}
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.largestPalindrome(8));
}
}
