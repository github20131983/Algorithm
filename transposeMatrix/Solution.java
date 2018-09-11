package transposeMatrix;

public class Solution {
	public int[][] transpose(int[][] A) {
		int[][] B=new int[A[0].length][A.length];
		for(int i=0;i<A.length;i++)
			for(int j=0;j<A[i].length;j++)
				B[j][i]=A[i][j];
		return B;      
    }
    
    public static void main(String[] args){
    	Solution s=new Solution();
    	int[][] A={{1,2,3},{4,5,6}};
    	int[][] B=s.transpose(A);
    	for(int[] i:B){
    		for(int j:i)
    			System.out.print(j); 
    			System.out.println();
    		}
    }
}
