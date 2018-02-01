package validPerfectSquare;

public class Solution {
public boolean isPerfectSquare(int num) {
        int left=1;
        int right=num;
        long middle;
        while(left<=right){
        middle=(right+left)>>>1;
        if(middle*middle==num)
        	return true;
        else if(middle*middle<num)
        	left=(int)middle+1;
        else
        	right=(int)middle-1;
        }
        return false;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.isPerfectSquare(2147483647));
}
}
