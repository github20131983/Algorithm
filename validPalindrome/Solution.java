package validPalindrome;

public class Solution {
public boolean isPalindrome(String s) {
        char[] c=s.toCharArray();
        for(int i=0,j=c.length-1;i<j;){
        	if(!Character.isLetterOrDigit(c[i]))
        		i++;
        	else if(!Character.isLetterOrDigit(c[j]))
        		j--;
        	else if(Character.toLowerCase(c[i++])!=Character.toLowerCase(c[j--]))
        		return false;
        }
        return true;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.isPalindrome("A man, a plan, a canal: Panama"));
	System.out.println(s.isPalindrome("race a car"));
	System.out.println(s.isPalindrome("  "));
}
}
