package validAnagram;

public class Solution {
public boolean isAnagram(String s, String t) {
	if(s.length()!=t.length())return false;
    int[] diffetBetweenSandT=new int[26];
	for(int i=0;i<s.length();i++)
		diffetBetweenSandT[s.charAt(i)-'a']++;
	for(int i=0;i<t.length();i++)
		diffetBetweenSandT[t.charAt(i)-'a']--;
	for(int i=0;i<diffetBetweenSandT.length;i++)
		if(diffetBetweenSandT[i]!=0)return false;
	return true;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.isAnagram("asdfgtrewq", "qwerasdfgt"));
}
}
