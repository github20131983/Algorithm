package imageSmoother;

public class Solution {
public int[][] imageSmoother(int[][] M) {
	int res[][]=new int[M.length][M[0].length];
        for(int i=0;i<M.length;i++)
        	for(int j=0;j<M[0].length;j++)
        		res[i][j]=smooth(M, i, j);
        return res;
    }
public int smooth(int M[][],int i,int j){
	int nx=M.length;
	int ny=M[0].length;
	int sum=0;
	int count=0;
	for(int row=-1;row<=1;row++){
		for(int col=-1;col<=1;col++){
			if(i+row<0||col+j<0||i+row>=nx||j+col>=ny)
				continue;			
		sum+=M[i+row][j+col];
		count++;
		}
	}
	return sum/count;
}
public static void main(String[] args){
	int[][] a={{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
	Solution s=new Solution();
	int[][] r=s.imageSmoother(a);
	for (int i = 0; i < r.length; i++){ 
		for (int j = 0; j < r[0].length; j++) 
			System.out.print(r[i][j]+" ");	
		System.out.println();
	}
	}
}
