package powXN;

public class Solution {
	public double myPow(double x, int n) {
        if(n<0)
        	return x*pow(x,n+1);
        return pow(x, n);
    }
	public double pow(double x, int n) {
		if(n==0)return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? pow(x*x, n/2) : x*pow(x*x, n/2);
    }
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.print(s.myPow(2, 3));
	}
}
