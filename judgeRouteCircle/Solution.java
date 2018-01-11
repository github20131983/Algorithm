package judgeRouteCircle;

public class Solution {
public boolean judgeCircle(String moves) {
	int upAndDownFlag=0;
	int leftAndRightFlag=0;
	char[] movesArray=moves.toCharArray();
	for(int i=0;i<movesArray.length;i++)
		switch(movesArray[i]){
		case 'U':
			upAndDownFlag++;break;
		case 'D':
			upAndDownFlag--;break;
		case 'L':
			leftAndRightFlag++;break;
		case 'R':
			leftAndRightFlag--;break;
		default:
		}
	if(upAndDownFlag==0&&leftAndRightFlag==0)
		return true;
	else
       return false;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.judgeCircle("ULRD"));
}
}
