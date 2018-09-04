package magicSquaresInGrid;

public class Solution {
	public int numMagicSquaresInside(int[][] grid) {
        if(grid.length<3||grid[0].length<3)
        	return 0;
        int count=0;
        for(int i=1;i<grid.length-1;i++)
        	for(int j=1;j<grid[i].length-1;j++){
        		if(checkValid(i, j, grid)&&sumRowAndColumn(i,j,grid)&&sumSlash(i,j,grid))
        			count++;       			        			
        	}
        	return count;
    }
	public boolean checkValid(int row,int colum,int grid[][]){
		for(int i=row-1;i<=row+1;i++)
			for(int j=colum-1;j<=colum+1;j++)
				if(grid[i][j]<1||grid[i][j]>9)
					return false;
		return true;
	}

	public boolean sumRowAndColumn(int row,int column,int grid[][]){
		int sum=0;
		for(int i=row-1;i<=row+1;i++){
				sum=grid[i][column]+grid[i][column-1]+grid[i][column+1];
			if(sum!=15)
				return false;
		}
		for(int i=column-1;i<=column+1;i++){
			sum=grid[row][column]+grid[row-1][column]+grid[row+1][column];
		if(sum!=15)
			return false;
	}
		return true;
	}
	public boolean sumSlash(int row,int column,int[][] grid){
		return (grid[row-1][column-1]+grid[row][column]+grid[row+1][column+1]==15
				&&grid[row-1][column+1]+grid[row][column]+grid[row+1][column-1]==15);
	}
	public static void main(String[] args){
		int[][] g={ {3,2,9,2,7},
					{6,1,8,4,2},
					{7,5,3,2,7},
					{2,9,4,9,6},
					{4,3,8,2,5}
					};
		System.out.print((new Solution()).numMagicSquaresInside(g));
	}
}
