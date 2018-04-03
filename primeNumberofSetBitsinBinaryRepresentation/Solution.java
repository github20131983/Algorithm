package primeNumberofSetBitsinBinaryRepresentation;

public class Solution {
public int countPrimeSetBits(int L, int R) {
	int count=0;
	for(int i=L;i<=R;i++){
		int theNumberOfOne=0;
		for(int j=i;j>0;j>>=1)			
			theNumberOfOne+=j&1;	
        if(isPrime(theNumberOfOne))
        	count++;
	}
     return count;   
    }	
public boolean isPrime(int n){
	if(n==1)return false;
	int x=(int)Math.sqrt(n);
	for(int i=2;i<=x;i++)
		if(n%i==0)return false;
	return true;
}
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.countPrimeSetBits(6, 10));
}
}
