package guessNumberHigherorLower;

public class Solution extends GuessGame {
public int guessNumber(int n) {
       int left=1;
       int right=n;
       while(left<=right){
    	   int middle=left+(right-left)/2;
    	   if(guess(middle)==0)
    		   return middle;
    	   if(guess(middle)==-1)
    		   right=middle-1;
    	   if(guess(middle)==1) 
    		   left=middle+1;
       }
       return -1;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.guessNumber(10));
}
}
