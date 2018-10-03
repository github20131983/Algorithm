package generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> generateParenthesis(int n) {
		List<String> list=new ArrayList<String>();
		backtrack(list,"",0,0,n);
		return list;      
    }
	public void backtrack(List<String> list,String str,int begin,int end,int max){
		if(str.length()==2*max){
			list.add(str);
			return;
		}
		if(begin<max)
			backtrack(list, str+"(", begin+1, end, max);
		if(end<begin)
			backtrack(list, str+")", begin, end+1, max);
	}
	public static void main(String[] args){
		Solution s=new Solution();
		List<String> list=new ArrayList<>();
		list=s.generateParenthesis(3);
		for(String str:list)
			System.out.println(str);
	}
}
