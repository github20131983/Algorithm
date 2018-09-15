package groupsOfSpecialEquivalentStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//通过奇数位置的任意次交换或者偶数位置的任意次交换相等的所有字符串的集合d的个数
public class Solution {
public int numSpecialEquivGroups(String[] A) {
		Set<String> set=new HashSet<>();
        for(String str:A){
        	int[] count=new int[52];
        	for(int i=0;i<str.length();i++)
        		count[str.charAt(i)-'a'+26*(i%2)]++;
        	set.add(Arrays.toString(count));
        }
        return set.size();
    }
public static void main(String[] args){
	Solution s=new Solution();
	String[] str={"abcd","cdab","adcb","cbad"};
	System.out.print(s.numSpecialEquivGroups(str));
}
}
