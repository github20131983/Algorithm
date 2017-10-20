package addDgits;

public class Solution {
 public int addDigits(int num){
		return 1+(num-1)%9;
  }
  public static void main(String[] args){
	  Solution s=new Solution();
	  System.out.println(s.addDigits(111));
  }
}
