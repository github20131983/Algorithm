package setMatrixZeroes;

public class Solution {
	public void setZeroes(int[][] matrix) {
        int colFlag=1,row=matrix.length,column=matrix[0].length;
        for(int i=0;i<row;i++){
        	if(matrix[i][0]==0)colFlag=0;
        	for(int j=1;j<column;j++)
        		if(matrix[i][j]==0){
        			matrix[0][j]=0;
        			matrix[i][0]=0;
        		}
        }
        for(int i=row-1;i>=0;i--){
        	for(int j=column-1;j>=1;j--)
        		if(matrix[i][0]==0||matrix[0][j]==0)
        			matrix[i][j]=0;
        	if(colFlag==0)
        		matrix[i][0]=0;
        	}
    }
	public static void main(String[] args){
		Solution s=new Solution();
		int[][] test={{0,1,2,0},
				  {3,4,5,2},
				  {1,3,1,5}};
		s.setZeroes(test);
		for(int[] i:test){
			for(int j:i)
				System.out.print(j+" ");
					System.out.println();
		}
	}
}
