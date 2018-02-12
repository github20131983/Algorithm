package hammingDistance;

public class Solution {
public int hammingDistance(int x, int y) {
	int distance=0;
	while(x>0||y>0){
        int xBit=x&1;
        int yBit=y&1;
        distance+=Math.abs(xBit-yBit);
        x=x>>>1;
        y=y>>>1;
	} 
	return distance;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.hammingDistance(0, 0));
}
}
