package twoSumIIIDatastructuredesign;

import java.util.HashMap;
import java.util.Map;
//<值，值出现的次数>
public class Solution {
private Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
private void add(int number){
	if(mp.containsKey(number))
		mp.put(number, mp.get(number)+1);
	else
		mp.put(number, 1);		
}
private boolean find(int target){
	for(int key: mp.keySet()){
		int temp=target-key;
		if(temp==key&&mp.get(temp)>1)
			return true;
		if(temp!=key&&mp.containsKey(target-key))
			return true;
		}	
	return false;
}
public static void main(String[] args){
	Solution s=new Solution();
	s.add(1);
	s.add(2);
	s.add(3);
	s.add(3);
	s.add(3);
	System.out.println(s.find(4));
}
}
