package projectionAreaOf3DShapes;

public class Solution {
public int projectionArea(int[][] grid) {
	    int res=0;
        for(int i=0;i<grid.length;i++){
        	int maxcol=0,maxrow=0;
        	for(int j=0;j<grid[i].length;j++){
        		if(grid[i][j]>0)res++;
        		maxrow=Math.max(maxrow, grid[i][j]);
        		maxcol=Math.max(maxcol, grid[j][i]);
        	}
        	res+=maxcol+maxrow;
        }
        return res;
    }
public static void main(String argsp[]){
	int[][] g={{1,2},{3,4}};
	System.out.println((new Solution()).projectionArea(g));
}
}
