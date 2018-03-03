package reshapetheMatrix;

public class Solution {
public int[][] matrixReshape(int[][] nums, int r, int c) {
	int m=nums.length;
	int n=nums[0].length;
	if(r*c!=m*n)
		return nums;
	int result[][]=new int[r][c];
	for(int i=0;i<r*c;i++)
			result[i/c][i%c]=nums[i/n][i%n];		
	return result;        
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[][] nums={{1,2},{3,4}};
	int[][] a=s.matrixReshape(nums, 1, 4);
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[i].length;j++)
			System.out.print(a[i][j]+" ");
	        System.out.println();
	}
}
}
