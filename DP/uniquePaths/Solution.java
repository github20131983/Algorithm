package uniquePaths;

import java.util.Arrays;

public class Solution {
	public int uniquePaths(int m, int n) {
        if(m>n)return uniquePaths(n, m);
        int[] temp=new int[m];
        Arrays.fill(temp, 1);
        for(int i=1;i<n;i++)
          for(int j=1;j<m;j++)
        	temp[j]+=temp[j-1];
        return temp[m-1];
    }
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.uniquePaths(2, 2));
	}
}
