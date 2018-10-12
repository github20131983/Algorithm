package jumpGame;

public class Solution {
	public boolean canJump(int[] nums) {
		int max=nums[0];
        for(int i=0;i<nums.length;i++){
        	if(i>max)return false;
        	if(max>=nums.length-1)return true;
        	max=Math.max(i+nums[i], max);
        }
        return true;
    }
	public static void main(String[] args){
		Solution s=new Solution();
		int[] test={3,2,1,0,4};
		System.out.print(s.canJump(test));
	}
}
