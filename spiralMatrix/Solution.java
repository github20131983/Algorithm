package spiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res=new ArrayList<Integer>();
		if(matrix.length==0)return res;
        int m=matrix.length,n=matrix[0].length;       
    	int left=0,right=n,top=0,bottom=m;
        for(int rectangleNum=0;rectangleNum<(n+1)/2;rectangleNum++){
        	int i=rectangleNum,j=rectangleNum;
        	while(j<right)res.add(matrix[i][j++]);
        		j--;//回退
        		if(i+1<bottom)i++;//试探
        		else break;
        	while(i<bottom)res.add(matrix[i++][j]);
	        	i--;
	        	if(j-1>=left)j--;
	        	else break;
        	while(j>=left)res.add(matrix[i][j--]);
        	    j++;
        	    if(i-1>top)i--;
        	    else break;
        	while(i>top)res.add(matrix[i--][j]);
        	
			left++;
			right--;
			top++;
			bottom--;
        }
        return res;
    }
	public static void main(String[] args){
		Solution s=new Solution();
		int[][] test={{1,2,3},{5,6,7}};
		System.out.println(s.spiralOrder(test));
		}
}
