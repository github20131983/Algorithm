package majorityElement;
//找到不同的就成对删除
public class Solution {
public int majorityElement(int[] nums) {
	int temp=0;
	int count=0;
	for(int i=0;i<nums.length;i++){
		if(count==0){
			count=1;
			temp=nums[i];
		}
		else if(nums[i]!=temp){
			count--;
		}
		else 
			count++;
	}
	return temp;        
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] a={6,5,5};
	System.out.println(s.majorityElement(a));
}
}
