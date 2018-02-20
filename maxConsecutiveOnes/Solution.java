package maxConsecutiveOnes;

public class Solution {
public int findMaxConsecutiveOnes(int[] nums) {
	int i=0;
	int maxConsecutive=0;
	int count=0;
	while(i<nums.length&&nums[i]!=1)i++;
	while(i<nums.length){                                                                                                          
		while(i<nums.length&&nums[i]==1){
			count++;
			i++;
		}
		if(count>maxConsecutive)
			maxConsecutive=count;
		count=0;
		i++;
	}
	return maxConsecutive;        
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] a={0};
	System.out.println(s.findMaxConsecutiveOnes(a));
}
}
