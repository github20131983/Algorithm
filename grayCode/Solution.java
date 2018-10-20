package grayCode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> grayCode(int n) {
        List<Integer> list=new ArrayList<>();
        list.add(0);
        for(int i=0;i<n;i++){
        	for(int j=list.size()-1;j>=0;j--)
        		list.add((1<<i)+list.get(j));
        }
        return list;
    }
	public static void main(String[] args){
		Solution s=new Solution();
		List<Integer> res=s.grayCode(2);
		for(Integer r:res)
			System.out.print(r+" ");
	}
}
