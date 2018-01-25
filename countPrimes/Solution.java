package countPrimes;

import java.util.Arrays;

public class Solution {
public int countPrimes(int n) {
        boolean[] flag=new boolean[n+1];
        int num=0;
        Arrays.fill(flag, true);
        for(int i=2;i<Math.sqrt(n)+1;i++)
        	if(flag[i]){
        		for(int j=2;j*i<=n;j++)
        			flag[j*i]=false;
        	}
        for(int i=2;i<n;i++)
        	if(flag[i])
        		num++;
        return num;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.countPrimes(4));
}
}
