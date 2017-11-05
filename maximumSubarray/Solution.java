package maximumSubarray;

public class Solution {
	 public int maxSubArray1(int[] nums) {
		 int sum=nums[0];
		 int n=nums.length;
	        for(int i=0;i<n;i++){
	        	for(int j=i;j<n;j++){
	        		int thissum=0;
	        		for(int k=i;k<=j;k++)
	        			thissum=thissum+nums[k];
	        		if(thissum>sum)sum=thissum;
	        	}
	        }
	        return sum;
	    }

	 public int maxSubArray2(int[] nums) {
		 int sum=nums[0];
		 int n=nums.length;
	        for(int i=0;i<n;i++){
	        	int thissum=0;
	        	for(int j=i;j<n;j++){	        		
	        			thissum=thissum+nums[j];
	        		if(thissum>sum)sum=thissum;
	        	
	        }
	       }
	        return sum;
	    }
	 public int maxSubArray3p(int[] nums,int left,int right) {
		 int sum=nums[0];
		 if(left==right)sum=nums[left]>0?nums[left]:0;
		 else{
			 int middle=(left+right)/2;
			 int leftsum=maxSubArray3p(nums,left,middle);
			 int rightsum=maxSubArray3p(nums,middle+1,right);
			 
			 int sleft=0;
			 int sleftmax=0;
			 for(int i=middle;i>=left;i--){
				 sleft+=nums[i];
			     if(sleft>sleftmax)sleftmax=sleft;
			 }
			 
			 int sright=0;
			 int srightmax=0;
			 for(int i=middle+1;i<=right;i++){
				 sright+=nums[i];
				 if(sright>srightmax)srightmax=sright;
			 }
			 
			 sum=srightmax+sleftmax;
			 if(sum<leftsum)sum=leftsum;
			 if(sum<rightsum)sum=rightsum;
		 }	       
	        return sum;
	    }
     public int maxSubArray3(int[] nums) {
		 return maxSubArray3p(nums,0,nums.length-1);
	 } 
     public int maxSubArray4(int[] nums){
    	int sum=nums[0];
    	int a=0;
    	for(int i=0;i<nums.length;i++){
    		if(a>0)a+=nums[i];
    		else a=nums[i];
    		if(a>sum)sum=a;
    	}
    	return sum;
     }
  public static void main(String[] args){
	  Solution s=new Solution();
	  int[] a={-1,2,-1,-1,-1,3,-1,5};
	  System.out.println(s.maxSubArray4(a));
	  System.out.println(s.maxSubArray3(a));
	  System.out.println(s.maxSubArray2(a));
	  System.out.println(s.maxSubArray1(a));
  }
}
