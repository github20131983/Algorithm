package fairCandySwap;

import java.util.HashSet;
import java.util.Set;

public class Solution {
public int[] fairCandySwap(int[] A, int[] B) {
        int sumA=0,sumB=0;
        Set<Integer> set=new HashSet<Integer>();
        for(int a:A)sumA+=a;
        for(int b:B){
        	sumB+=b;
        	set.add(b);
        }
        int dif=(sumB-sumA)/2;
        for(int a:A)
        	if(set.contains(a+dif))
        		return new int[]{a,a+dif};
        throw null;
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] A={1,1};
	int[] B={2,2};
	int[] res=s.fairCandySwap(A, B);
	for(int r:res)
		System.out.println(r);
}
}
