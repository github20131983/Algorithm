package validPalindromeII;

public class Solution {
	 public boolean validPalindrome(String s) {
	        int begin=-1,end=s.length();
	        while(++begin<--end)
	        	if(s.charAt(begin)!=s.charAt(end))
	        		return isPalindromic(s,begin-1,end)||isPalindromic(s,begin,end+1);
	        return true;
	    }
	 public boolean isPalindromic(String s, int l, int r) {
		    while (++l < --r) 
		        if (s.charAt(l) != s.charAt(r)) return false;
		    return true;
		}

	public static void main(String[] args) {
		Solution s=new Solution();
		String str="abc";
		System.out.println(s.validPalindrome(str));
	}

}
