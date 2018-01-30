package nimGame;

public class Solution {
public boolean canWinNim(int n) {
	     int temp=n-n/4*4;
        if(temp>0&&temp<=3)
        	return true;
        else
        	return false;
    }
public static void main(String[] args){
	Solution s=new Solution();
	for(int i=1;i<10;i++)
	System.out.println(s.canWinNim(i));
}
}
