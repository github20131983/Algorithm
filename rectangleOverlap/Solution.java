package rectangleOverlap;

public class Solution {
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
	        return (!(rec1[3]<=rec2[1]||rec1[2]<=rec2[0]||rec1[1]>=rec2[3]||rec1[0]>=rec2[2]));
	    }
	public static void main(String[] args){
		int[] r1={0,0,1,1};
		int[] r2={1,0,2,1};
		System.out.println((new Solution()).isRectangleOverlap(r1, r2));
	}
}
