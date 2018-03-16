package sumofSquareNumbers;

public class Solution {
public boolean judgeSquareSum(int c) {
        if(c<0)return false;
        int left=0,right=(int)Math.sqrt(c);
        while(right>=left){
        	int temp=left*left+right*right;
        	if(temp==c)return true;
        	else if(temp>c)right--;
        	else left++;
        }
        return false;
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.print(s.judgeSquareSum(0));
	}

}
