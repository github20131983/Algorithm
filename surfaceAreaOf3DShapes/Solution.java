package surfaceAreaOf3DShapes;

public class Solution {
public int surfaceArea(int[][] grid) {
	int surface=0;
        for(int i=0;i<grid.length;i++)
        	for(int j=0;j<grid[i].length;j++){
        		surface+=6*grid[i][j];
        		if(grid[i][j]>1)
        			surface-=(grid[i][j]-1)*2;
        		if(i-1>=0)
        			surface-=Math.min(grid[i][j],grid[i-1][j])*2;
        		if(j-1>=0)
        			surface-=Math.min(grid[i][j],grid[i][j-1])*2;
        	}
     return surface; 		
    }
public static void main(String[] arsg){
	Solution s=new Solution();
	int[][] grid={{2,2,2},{2,1,2},{2,2,2}};
	System.out.print(s.surfaceArea(grid));
}
}
