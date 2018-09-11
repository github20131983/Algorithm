package binaryGap;

public class Solution {
	public int binaryGap(int N) {		
		int A[]=new int[32];
		int t=0;
		for(int i=0;i<32;i++)
			if(((N>>i)&1)!=0)
				A[t++]=i;
		int res=0;
		for(int i=0;i<t-1;i++)
			res=Math.max(res,A[i+1]-A[i]);
		return res;
    }
    
    public static void main(String[] args){
    	System.out.println((new Solution()).binaryGap(5));
    }
}
