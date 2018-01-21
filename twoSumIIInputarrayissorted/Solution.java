package twoSumIIInputarrayissorted;

public class Solution {
public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        for(int i=0,j=numbers.length-1;i<j;){
        	if(numbers[i]+numbers[j]==target){
        		result[0]=i+1;
        	    result[1]=j+1;
        	    break;
        	}
        	else if(numbers[i]+numbers[j]<target)
        		i++;
        	else if(numbers[i]+numbers[j]>target)
        		j--;
        }
        return result;
    }
    public static void main(String[] args){
    	Solution s=new Solution();
    	int[] b={2, 7, 11, 15};
    	int a[]=s.twoSum(b, 18);
    	for(int i=0;i<a.length;i++)
    		System.out.println(a[i]);
    }
}
