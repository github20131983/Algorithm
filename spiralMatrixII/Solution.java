package spiralMatrixII;

public class Solution {
	public int[][] generateMatrix(int n) {
		int top=0,bottom=n,left=0,right=n;
		int num=1;
		int[][] res = new int[n][n];
        for(int rectangleNum=0;rectangleNum<(n+1)/2;rectangleNum++){
        	int i=rectangleNum,j=rectangleNum;
        	while(j<right)res[i][j++]=num++;
        		j--;//回退
        		if(num<=n*n)i++;//试探
        		else break;
        	while(i<bottom)res[i++][j]=num++;
	        	i--;
	        	if(num<=n*n)j--;
	        	else break;
        	while(j>=left)res[i][j--]=num++;
        	    j++;
        	    if(num<=n*n)i--;
        	    else break;
        	while(i>top)res[i--][j]=num++;
        	
			left++;
			right--;
			top++;
			bottom--;
        }    
        return res;
    }
	public static void main(String[] args){
		int[][] test=(new Solution()).generateMatrix(9);
		for(int[] i:test){
			for(int j:i)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
