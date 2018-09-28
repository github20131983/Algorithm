package wordBreak;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public boolean wordBreak(String s, List<String> wordDict) {
		boolean[] flag=new boolean[s.length()+1];
		flag[0]=true;
		for(int i=1;i<=s.length();i++)
			for(int j=0;j<i;j++){
				if(flag[j]&&wordDict.contains(s.substring(j,i))){
					flag[i]=true;
					break;
				}
			}
		return flag[s.length()];      
    }
	public static void main(String[] args){
		Solution s=new Solution();
		List<String> wordDict=new ArrayList<String>();
		wordDict.add("aaa");
		wordDict.add("aaaa");
		System.out.println(s.wordBreak("aaa", wordDict));
	}
}
