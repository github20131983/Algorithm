package perfectNumber;

public class Solution {
public boolean checkPerfectNumber(int num) {
	if(num==0||num==1)return false;
	int sum=0;
	for(int i=1;i<=Math.sqrt(num);i++)
		if(num%i==0)
			sum+=i+num/i;
	if(2*num==sum)return true;
	return false;      
    }
public static void main(String[] args){
	Solution s=new Solution();
	for(int i=1;i<100;i++)
	System.out.println(i+":"+s.checkPerfectNumber(i));
}
}
