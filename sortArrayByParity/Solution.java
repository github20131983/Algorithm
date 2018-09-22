package sortArrayByParity;

public class Solution {
	 public int[] sortArrayByParity(int[] A) {
		 int i=0,j=A.length-1;
	     while(i<j){
	    	 if(A[i]%2>A[j]%2){
	    		 int temp=A[i];
	    		 A[i]=A[j];
	    		 A[j]=temp;
	    	 }
	    	 if(A[i]%2==0)i++;
	    	 if(A[j]%2==1)j--;
	     }  
	     return A;
	    }
	 public static void main(String[] args){
		 int A[]={3,1,2,4};
		 Solution s=new Solution();
		 int B[]=s.sortArrayByParity(A);
		 for(int i=0;i<B.length;i++)
			 System.out.println(B[i]);
	 }
}
