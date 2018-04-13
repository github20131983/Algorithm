package longestPalindromicSubstring;

public class Solution {
	public String longestPalindrome(String s) {
		String news="$#";
		for(int i=0;i<s.length();i++)
          news+=s.charAt(i)+"#";
        System.out.println(news);
        int middle=0,right=0;
        int maxLen=0,maxPoint=0;
        int[] len=new int[news.length()];
        for(int i=1;i<news.length();i++){
        	len[i]=right>i?Math.min(right-i, len[2*middle-i]):1;
        	while((i+len[i])<news.length()&&news.charAt(i+len[i])==news.charAt(i-len[i]))len[i]++;
        	if(i+len[i]>right){
        		middle=i;
        		right=i+len[i];
        	}
        	if(len[i]>maxLen){
        		maxPoint=i;
        		maxLen=len[i];
        	}
        }
        return s.substring((maxPoint-maxLen)/2,(maxPoint+maxLen)/2-1);
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.longestPalindrome("abababab"));
	}
}
