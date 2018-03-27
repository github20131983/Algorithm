package maxAreaofIsland;

public class Solution {
public int maxAreaOfIsland(int[][] grid) {
	    int maxArea=0;
        for(int i=0;i<grid.length;i++)
        	for(int j=0;j<grid[0].length;j++)
        		if(grid[i][j]==1)maxArea=Math.max(maxArea, maxAreaOfIslandHelper(grid,i,j));
        return maxArea;
  }
public int maxAreaOfIslandHelper(int[][] grid,int i,int j){
	if(i>=0&&i<grid.length&&j>=0&&j<grid[0].length&&grid[i][j]==1){
		grid[i][j]=0;
		return 1+maxAreaOfIslandHelper(grid,i+1,j)+maxAreaOfIslandHelper(grid,i-1,j)+maxAreaOfIslandHelper(grid,i,j+1)+maxAreaOfIslandHelper(grid,i,j-1);
        	}
	return 0;
}
public static void main(String[] args){
	Solution s=new Solution();
	int[][] a={{0,0,1,0,0,0,0,1,0,0,0,0,0},
			 {0,0,0,0,0,0,0,1,1,1,0,0,0},
			 {0,1,1,0,1,0,0,0,0,0,0,0,0},
			 {0,1,0,0,1,1,0,0,1,0,1,0,0},
			 {0,1,0,0,1,1,0,0,1,1,1,0,0},
			 {0,0,0,0,0,0,0,0,0,0,1,0,0},
			 {0,0,0,0,0,0,0,1,1,1,0,0,0},
			 {0,0,0,0,0,0,0,1,1,0,0,0,0}};
	System.out.println(s.maxAreaOfIsland(a));
}
}
