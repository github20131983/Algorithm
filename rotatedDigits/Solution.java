package rotatedDigits;

public class Solution {
	public int rotatedDigits(int N) {
		int count=0;
		for(int i=1;i<=N;i++){
        if(isvalid(i))
        	count++;
		}
		return count;
    }
	public boolean isvalid(int n){
		boolean flag=false;
		while(n>0){
			if(n%10==2)flag=true;
			if(n%10==5)flag=true;
			if(n%10==6)flag=true;
			if(n%10==9)flag=true;
			if(n%10==3)return false;
			if(n%10==4)return false;
			if(n%10==7)return false;
			n/=10;
		}
		return flag;
	}
	public static void main(String[] args) {
	Solution s=new Solution();
	System.out.println(s.rotatedDigits(10));
	}

}
