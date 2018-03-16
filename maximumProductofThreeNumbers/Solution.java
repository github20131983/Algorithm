package maximumProductofThreeNumbers;

import java.awt.print.Printable;

public class Solution {
public int maximumProduct(int[] nums) {
        int maxFirsrt=Integer.MIN_VALUE;
        int maxSecond=Integer.MIN_VALUE;
        int maxThird=Integer.MIN_VALUE;
        int minFirsrt=Integer.MAX_VALUE;
        int minSecond=Integer.MAX_VALUE;
        for(int num:nums){
        	if(num>maxFirsrt){
        		maxThird=maxSecond;
        		maxSecond=maxFirsrt;
        		maxFirsrt=num;       		
        	}
        	else if(num>maxSecond){
        		maxThird=maxSecond;
        		maxSecond=num;
        	} 
        	else if(num>maxThird)
        		maxThird=num;
        	if(num<minFirsrt){
        		minSecond=minFirsrt;
        		minFirsrt=num;
        	}   
        	else if(num<minSecond)
        		minSecond=num;
        }
        return Math.max(maxFirsrt*maxSecond*maxThird, maxFirsrt*minFirsrt*minSecond);
    }
	
	public static void main(String[] args) {
			Solution s=new Solution();
			int[] a={-4,-3,-2,-1,60};
			System.out.println(s.maximumProduct(a));
	}

}
