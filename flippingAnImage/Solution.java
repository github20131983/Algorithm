package flippingAnImage;

public class Solution {
public int[][] flipAndInvertImage(int[][] A) {
		int length=A[0].length;
        for(int i=0;i<A.length;i++){        	
        	for(int j=0;j<(length+1)/2;j++){
        		int temp=A[i][j];
        		A[i][j]=A[i][length-1-j]^1;
        		A[i][length-1-j]=temp^1;
        	}
        	//if(length%2==1)A[i][length/2]^=1;	
        }
        	return A;	
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[][] ori={{1},{0}};
	int[][] res=s.flipAndInvertImage(ori);
	for(int i=0;i<res.length;i++){
		for(int j=0;j<res[i].length;j++)
			System.out.print(res[i][j]);
		System.out.println();
	}
}
}
