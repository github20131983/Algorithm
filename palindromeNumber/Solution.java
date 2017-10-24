package palindromeNumber;

public class Solution {
public boolean isPalindrome(int x) {
        if(x<0||x!=0&&x%10==0)return false;
        int after=0;
        while(x>after){
        	after=after*10+x%10;
        	x=x/10;
        }
        return (after==x||after/10==x);       
    }
 
  public static void main(String[] args){
	  Solution s=new Solution();
	  System.out.println(s.isPalindrome(0));
  }
}
