package minimumIndexSumofTwoLists;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
public String[] findRestaurant(String[] list1, String[] list2) {
	Map<String,Integer> mp=new HashMap<String,Integer>();
	List<String> l=new LinkedList<String>();
	int minSum=Integer.MAX_VALUE;
	for(int i=0;i<list1.length;i++)mp.put(list1[i],i);
	for(int j=0;j<list2.length;j++){
		Integer k=mp.get(list2[j]);
		if(k!=null&&k+j<=minSum){
			if(k+j<minSum){l.clear();minSum=k+j;}
			l.add(list2[j]);
		}
	}			
	return l.toArray(new String[l.size()]);       
    }
public static void main(String[] args){
	Solution s=new Solution();
	String[] str1={"Shogun", "Tapioca Express", "Burger King", "KFC"};
	String[] str2={"KFC", "Shogun", "Burger King"};
	String[] result=s.findRestaurant(str1,str2);
	for(String str:result)
		System.out.println(str);
}
}
