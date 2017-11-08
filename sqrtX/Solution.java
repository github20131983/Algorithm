package sqrtX;

public class Solution {
public int mySqrt(int x) {
        if(x<=1)return x;
        int left=1,right=x;
        while(left<=right){
        	int middle=(left+right)/2;
        	if(middle==x/middle)return middle;
        	else if(middle<x/middle)left=middle+1;
        	else right=middle-1;      	
        }
        return right;
    }
  public static void main(String[] args){
	  Solution s=new Solution();
	  System.out.println(s.mySqrt(1));
  }
}
