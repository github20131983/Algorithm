package pascalTriangleII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	 public List<Integer> getRow(int rowIndex) {
	        List<Integer> rowList=new ArrayList<Integer>();
	        rowList.add(1);
	        for(int i=1;i<=rowIndex;i++){
	        	rowList.add(i, 0);
	        	for(int j=i;j>=1;j--)
	        		rowList.set(j,rowList.get(j)+rowList.get(j-1));
	        }
	        return rowList;
	    }
public static void main(String[] args){
	Solution s=new Solution();
	List<Integer> r=new ArrayList<Integer>();
	r=s.getRow(1);
	for(int i=0;i<r.size();i++)
		System.out.print(r.get(i)+" ");
}	
}
