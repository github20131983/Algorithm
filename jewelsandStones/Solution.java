package jewelsandStones;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int numJewelsInStones(String J, String S) {
		int res = 0;
        Set<Character> setJ = new HashSet<Character>();
        for (char j: J.toCharArray()) setJ.add(j);
        for (char s: S.toCharArray()) if (setJ.contains(s)) res++;
        return res;
    }
	public static void main(String[] args) {
	     Solution s=new Solution();
	     String J="zds";
	     String S="ZZadssAz";
	     System.out.println(s.numJewelsInStones(J, S));
	}

}
