package minimumPathSum;

import java.awt.GridBagConstraints;

public class Solution {
	public int minPathSum(int[][] grid) {
        int temp[]=new int[grid[0].length];
        temp[0]=grid[0][0];
        for(int i=1;i<temp.length;i++)
        	temp[i]=grid[0][i]+temp[i-1];       
        for(int i=1;i<grid.length;i++)
        	for(int j=0;j<grid[i].length;j++)
        		if(j==0)
        			temp[j]+=grid[i][j];
        		else
        			temp[j]=Math.min(temp[j-1]+grid[i][j],temp[j]+grid[i][j]);
          return temp[grid.length-1];      
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		int[][] g={ {1,2},
				    {5,6},
				    {1,1}};
		System.out.print(s.minPathSum(g));
	}
}
