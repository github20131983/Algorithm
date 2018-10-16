package sortColors;

public class Solution {
	public void sortColors(int[] nums) {
        int onePass=0,twoPass=nums.length-1;
        for(int i=0;i<=twoPass;i++){
        	if(nums[i]==0){
        		int temp=nums[i];
        		nums[i]=nums[onePass];
        		nums[onePass++]=temp;
        	}
        	else if(nums[i]==2){
        		int temp=nums[i];
        		nums[i--]=nums[twoPass];
        		nums[twoPass--]=temp;
        	}	
        }
    }
	public static void main(String[] args){
		Solution s=new Solution();
		int[] test={2,0,2,1,1,0};
		s.sortColors(test);
		for(int i:test)
			System.out.print(i+" ");
	}
}
