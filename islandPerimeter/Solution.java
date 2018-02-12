package islandPerimeter;

public class Solution {
public int islandPerimeter(int[][] grid) {
	int islands=0,neighbours=0;
	for(int i=0;i<grid.length;i++)
		for(int j=0;j<grid[i].length;j++)
			if(grid[i][j]==1){
				islands+=1;
				if(i<grid.length-1&&grid[i+1][j]==1)neighbours++;
				if(j<grid[i].length-1&&grid[i][j+1]==1)neighbours++;
			}
	return islands*4-neighbours*2;       
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[][] g={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
	System.out.println(s.islandPerimeter(g));
}
}
