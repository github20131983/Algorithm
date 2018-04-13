package longestPalindromicSubstring;

public class Solution1 {
	int maxlength=0,begin=0;
	public String longestPalindrome(String s) {
		if(s.length()<=1)return s;
		for(int i=0;i<s.length();i++){
			maxPalindrome(s,i,i+1);
			maxPalindrome(s,i,i);
		}
		return s.substring(begin,begin+maxlength);
	}
	public void maxPalindrome(String s,int j,int k) {
		while(j>=0&&k<s.length()&&s.charAt(j)==s.charAt(k)){
			j--;
			k++;
		}
		if(k-j+1>maxlength){
			begin=j+1;
			maxlength=k-j-1;
		}
	}
	public static void main(String[] args) {
		Solution1 s=new Solution1();
		System.out.println(s.longestPalindrome("abba"));
	}

}
