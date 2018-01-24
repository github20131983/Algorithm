package happyNumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {
public boolean isHappy(int n) {
        int m=0;
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        while(n>0){
        	int temp=n%10;
        	n=n/10;
        	m+=temp*temp;
        	if(n==0){
        		if(m==1)
        			return true;
        		if(mp.containsKey(m))
        			mp.put(m, mp.get(m)+1);
        		else
        			mp.put(m, 1);
        		if(mp.get(m)>1)
        			return false;
        		n=m;
        		m=0;
        		}
        }
        return false;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.isHappy(3));
}
}

