package uniquePaths2;

public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int temp[]=new int[obstacleGrid[0].length];
		temp[0]=1;
		for(int[] row:obstacleGrid)
			for(int i=0;i<row.length;i++){
				if(row[i]==1)
					temp[i]=0;
				else if(i>0)
					temp[i]+=temp[i-1];
			}
		return temp[obstacleGrid[0].length-1];
    }
	public static void main(String[] args){
		Solution s=new Solution();
		int[][] o={{0}};
		System.out.println(s.uniquePathsWithObstacles(o));
	}
}
