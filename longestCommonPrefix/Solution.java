package longestCommonPrefix;

public class Solution {
public String longestCommonPrefix(String[] strs) {
	    if(strs==null||strs.length==0)return "";
        StringBuilder res=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
        	char c=strs[0].charAt(i);
        	for(int j=1;j<strs.length;j++){
        		if(i>=strs[j].length()||strs[j].charAt(i)!=c)
        			return res.toString();
        	}
        	res.append(c);
        }
        return res.toString();
    }

  public static void main(String[] args){
	  Solution s=new Solution();
	  String[] str={"aa","a"};
	  System.out.println(s.longestCommonPrefix(str));
  }
}
