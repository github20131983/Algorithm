package repeatedStringMatch;

public class Solution {
public int repeatedStringMatch(String A, String B) {
	 int count=1;
	 String temp=A;
     while(temp.length()<B.length()){
    	 temp+=A;
    	 count++;
     }
     if(temp.contains(B))return count;
     temp+=A;
     return temp.contains(B)?count+1:-1;
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.repeatedStringMatch("abcd", "cdabcdab"));
	}

}
