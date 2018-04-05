package subdomainVisitCount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(String cpdomain:cpdomains){
        	String[] str=cpdomain.split(" ");
        	int num=Integer.parseInt(str[0]);
        	String domains=str[1];
        	map.put(domains,map.getOrDefault(str[1], 0)+num);
        	for(int i=0;i<domains.length();i++)
        		if(domains.charAt(i)=='.')
        			map.put(domains.substring(i+1),map.getOrDefault(domains.substring(i+1), 0)+num);
        }
        List<String> res = new ArrayList<String>();
        for (String d : map.keySet()) res.add(map.get(d) + " " + d);
        return res;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		String[] test={"654 yaw.lmm.ca", "1225 lmm.ca"};
		List<String> l=s.subdomainVisits(test);
		for(String str:l)
			System.out.println(str);
	}

}
