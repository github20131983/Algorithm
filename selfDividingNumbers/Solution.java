package selfDividingNumbers;

import java.util.LinkedList;
import java.util.List;

public class Solution {
public List<Integer> selfDividingNumbers(int left, int right) {
	List<Integer> result=new LinkedList<Integer>(); 
        for(int i=left;i<=right;i++)
        	if(helper(i))
        	  result.add(i);
        return result;
    }
public boolean helper(int nums){
	int temp=nums;
	while(temp>0){
		int j=temp%10;
		if(j==0)return false;
		if(nums%j!=0)return false;
		temp/=10;
	}
	return true;
}
	public static void main(String[] args) {
		Solution s=new Solution();
		List<Integer> result=s.selfDividingNumbers(0, 22);
		for(int a:result)
			System.out.println(a);
	}
}
