package divideTwoIntegers;

public class Solution {
    public int divide(int dividend, int divisor) {
    	if(dividend==Integer.MIN_VALUE&&divisor==-1)
    		return Integer.MAX_VALUE;
    	int flag=(dividend>0?1:-1)+(divisor>0?1:-1);
    	long dividend_abs=Math.abs((long)dividend);
    	long divisor_abs=Math.abs((long)divisor);
    	int res=0;
    	while(dividend_abs>=divisor_abs){
    		long temp=divisor_abs,multiple=1;
    		while(dividend_abs>(temp<<1)){
    			temp<<=1;
    			multiple<<=1;
    		}
    		dividend_abs-=temp;
    		res+=multiple;
    	}
    	return flag==0?-res:res;
    }
    public static void main(String[] args){
    	Solution s=new Solution();
    	System.out.print(s.divide(Integer.MIN_VALUE,Integer.MIN_VALUE));
    }
}
