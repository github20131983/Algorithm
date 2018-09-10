package buddyStrings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean buddyStrings(String A, String B) {
		if(A.length()!=B.length())
			return false;
		if(A.equals(B)){
		Set<Character> set=new HashSet<Character>();
		for(char c:A.toCharArray())set.add(c);
		return set.size()<A.length();
		}
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<A.length();i++)
			if(A.charAt(i)!=B.charAt(i))
				list.add(i);
		if(list.size()==2&&A.charAt(list.get(0))==B.charAt(list.get(1))
				&&A.charAt(list.get(1))==B.charAt(list.get(0)))
			return true;
    	return false;        
    }
    public static void main(String[] args){
    	System.out.print((new Solution()).buddyStrings("abcaa", "abcbb"));
    }
}
