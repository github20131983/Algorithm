package peakIndexInaMountainArray;

public class Solution {
public int peakIndexInMountainArray(int[] A) {
	    int i=0;
	    if(A[0]>A[1])return 0;
	    if(A[A.length-1]>A[A.length-2])return A.length-1;
        while(A[i+1]>A[i])i++;
        return i;
    }
public int peakIndexInMountainArray2(int[] A) {
	int left=0,right=A.length-1;
	while(left<=right){
		 int mid=(right+left)/2;
		 if (A[mid] < A[mid + 1]) left = mid;
         else if (A[mid - 1] > A[mid]) right = mid;
         else return mid;
	}
   return -1;
}
public static void main(String[] args){
	Solution s=new Solution();
	int A[]={0,1,0};
	System.out.println(s.peakIndexInMountainArray2(A));
}
}
