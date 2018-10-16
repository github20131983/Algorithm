package searchA2DMatrix;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length==0)
			return false;
		int row=matrix.length,column=matrix[0].length;
        int left=0,right=row*column-1;
        while(left<=right){
        	int middle=left+(right-left)/2;
        	int i=middle/column,j=middle-i*column;
        	if(matrix[i][j]==target)
        		return true;
        	else if(matrix[i][j]>=target)
        		right=middle-1;
        	else
        		left=middle+1;
        }
        return false;
    }
	public static void main(String[] args){
		Solution s=new Solution();
		int[][] test={{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		System.out.println(s.searchMatrix(test,35));
	}
}	
