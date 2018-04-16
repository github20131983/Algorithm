package containerWithMostWater;

public class Solution {
	public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int thisArea,maxArea=0;
        while(left<right){
        	thisArea=(right-left)*Math.min(height[left], height[right]);
        	maxArea=Math.max(thisArea, maxArea);
        	if(height[left]>height[right])
        		right--;
        	else
        		left++;
        }
        return maxArea;
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] test={1,2,3,4,5};
		System.out.println(s.maxArea(test));
	}

}
