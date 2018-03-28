package countBinarySubstrings;

public class Solution {
public int countBinarySubstrings(String s) {
	  int count=1;
	  int i=0;
	  int res=0;
	  int temp=0;
      while(i<s.length()){
    	  while(i<s.length()-1&&s.charAt(i+1)==s.charAt(i)){
    		  count++;
    		  i++;
    		  }
    	   res+=Math.min(temp, count);
    	   temp=count;
    	   count=1;
    	   i++;
      }
      return res;
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		String str="110011";
		System.out.println(s.countBinarySubstrings(str));
	}
}
