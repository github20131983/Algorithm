package permutationSequence;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String getPermutation(int n, int k) {
        List<Integer> list=new ArrayList<Integer>();
        int[] factorial=new int[n+1];
        StringBuilder res=new StringBuilder();
        for(int i=1;i<=n;i++)
        	list.add(i);       
        factorial[0]=1;
        for(int i=1;i<=n;i++)
        	factorial[i]=factorial[i-1]*i;
        k--;
        for(int i=1;i<=n;i++){
        	int index=k/factorial[n-i];
        	res.append(String.valueOf(list.get(index)));
        	list.remove(index);
        	k-=index*factorial[n-i];
        }
        return String.valueOf(res);
    }
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.print(s.getPermutation(4, 9));
	}
}
