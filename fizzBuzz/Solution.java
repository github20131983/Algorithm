package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
public List<String> fizzBuzz(int n) {
        List<String> result=new ArrayList<String>();
        int countThree=1;
        int countFive=1;
        int countThreeMulFive=1;
        for(int i=1;i<=n;i++){
        	if(i==countThreeMulFive*15){
        		result.add("FizzBuzz");
        		countThreeMulFive++;
        		countThree++;
        		countFive++;
        		continue;
        	}
        	else if(i==countThree*3){
        		result.add("Fizz");
        		countThree++;
        		continue;
        	}
        	else if(i==countFive*5){
        		result.add("Buzz");
        		countFive++;
        		continue;
        	}
        	else
        		result.add(Integer.toString(i));
        }
        return result;
    }
public static void main(String[] args){
	Solution s=new Solution();
	List<String> l=s.fizzBuzz(30);
	for(String t:l)
		System.out.println(t);
}
}
