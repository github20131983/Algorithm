package binaryWatch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
public List<String> readBinaryWatch(int num) {
        List<String> result=new ArrayList<String>();
        if(num<0)return result;
        for(int h=0;h<12;h++)
        	for(int m=0;m<60;m++)
        		if(Integer.bitCount(h)+Integer.bitCount(m)==num)
        			result.add(String.format("%d:%02d",h,m));
        return result;
    }
public static void main(String[] args){
	   Solution s=new Solution();
	   ArrayList al=(ArrayList) s.readBinaryWatch(1);
	   Iterator ite=al.iterator();  
       while(ite.hasNext()){  
           System.out.println(ite.next());  
       }  
}
}
