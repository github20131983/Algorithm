package restoreIPAddresses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> restoreIpAddresses(String s) {
        List<String> list=new ArrayList<String>();
        String temp=new String();
        if(s.length()<4||s.length()>12)
        	return list;
        backtrack(s, 0, list, temp);
        return list;
    }
	public void backtrack(String s,int start,List<String> res,String temp){
		if (start == 3 && isValid(s)) {  
            res.add(temp + s);  
            return;  
        }  
        for(int i=0; i<3 && i<s.length()-1; i++){  
            String substr = s.substring(0,i+1);  
            if (isValid(substr))
                backtrack(s.substring(i+1, s.length()), start+1, res,temp + substr + '.');  
        }  
	}
	public boolean isValid(String s){
		if (s.charAt(0)=='0')
            return s.equals("0");  
		
        int num = Integer.parseInt(s);           
        if(num <= 255 && num > 0)
            return true;
        else
            return false;
	}
	public static void main(String[] args){
		Solution s=new Solution();
		String str="25525511135";
		System.out.print(s.restoreIpAddresses(str));
	}
}
