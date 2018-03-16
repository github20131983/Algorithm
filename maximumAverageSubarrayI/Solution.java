package maximumAverageSubarrayI;

public class Solution {
public double findMaxAverage(int[] nums, int k) {
	    int sum=0,max;
        for (int i = 0; i < k; i++) {
			sum+= nums[i];			
		}
        max=sum;
        for (int i = k; i < nums.length; i++) {
			sum+=nums[i]-nums[i-k];
			max=Math.max(sum, max);
		}
        return (double)max/k;
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] a={1,12,-5,-6,50,3};
		System.out.println(s.findMaxAverage(a, 4));
	}

}
