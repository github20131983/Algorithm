package pascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
public List<List<Integer>> generate(int numRows) {       
        List<List<Integer>> Columnlist=new ArrayList<List<Integer>>();
	for(int i=0;i<numRows;i++){
		List<Integer> Rowlist=new ArrayList<Integer>();
        	for(int j=0;j<=i;j++){       		
        		if(j==0)Rowlist.add(1);
        		if(j>0&&j<i)
        			Rowlist.add(Columnlist.get(i-1).get(j-1)+Columnlist.get(i-1).get(j));
        		if(i!=0&&j==i)Rowlist.add(1);    		
        	}
        	Columnlist.add(Rowlist);
	}
	return Columnlist;        		
    }
public static void main(String[] args){
	Solution s=new Solution();
	List<List<Integer>> l=s.generate(5);
	for(int i=0;i<l.size();i++){
		for(int j=0;j<l.get(i).size();j++)
			System.out.print(l.get(i).get(j)+" ");
	System.out.println();
	}
}
}
