package smallestRangeI;

public class Solution {
	public int smallestRangeI(int[] A, int K) {
		    int min=A[0],max=A[0];
	        for(int a:A){
	        	min=Math.min(min, a);
	        	max=Math.max(max, a);
	        }
	        return Math.max(0, max-min-2*K);
	    }
	public static void main(String[] args){
		Solution s=new Solution();
		int[] A={1,3,6};
		System.out.print(s.smallestRangeI(A, 3));
	}
}
