package studentAttendanceRecordI;

public class Solution {
public boolean checkRecord(String s) {
	int countA=0;
	for(int i=0;i<s.length();i++){	
	    if(s.charAt(i)=='A')
			countA++;
		if(countA>1)
			return false;
		else if(s.charAt(i)=='L'&&i<s.length()-2&&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L')
			return false;
	}
	return true;       
    }
public static void main(String[] args){
	String str="PPALLA";
	Solution s=new Solution();
	System.out.println(s.checkRecord(str));
}
}
