package uniqueBinarySearchTrees;

public class Solution {
	public int numTrees(int n) {
        int[] G=new int[n+1];
        G[0]=1;
        G[1]=1;
        for(int i=2;i<=n;i++)//以第i个为根
        	for(int j=1;j<=i;j++)//子切割
        		G[i]+=G[i-j]*G[j-1];
        return G[n];
    }
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.print(s.numTrees(3));
	}
}
