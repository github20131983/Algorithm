package rotateArray;

public class Solution {
public void rotate(int[] nums, int k) {
	    k=k%nums.length;
	    reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);       
    }
public void reverse(int[] nums,int begin,int end){
	while(begin<end){
		int temp;
		temp=nums[begin];
		nums[begin]=nums[end];
		nums[end]=temp;
		begin++;
		end--;
	}   
}
public static void main(String[] args){
	int[] a={1,2};
	new Solution().rotate(a, 0);
	for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
}
}
