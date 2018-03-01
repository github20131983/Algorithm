package reverseWordsinaStringIII;

public class Solution {
	 public String reverseWords(String s) {
		String[] sArray=s.split(" ");
		StringBuilder str=new StringBuilder();
		for(int i=0;i<sArray.length;i++)
			str.append(new StringBuilder(sArray[i]).reverse()+" ");
		return str.toString().trim();	        
	    }
	 public static void main(String[] args){
		 String str="Let's take LeetCode contest";
		 Solution s=new Solution();
		 System.out.println(s.reverseWords(str));
	 }
}
