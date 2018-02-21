package constructtheRectangle;

public class Solution {
public int[] constructRectangle(int area) {
	int[] result = new int[2];
	for(int i=(int)Math.sqrt(area);i>0;i--)
		if(area%i==0){
			result[0]=area/i;
			result[1]=i;
			break;
		}			
	return result;       
    }
public static void main(String[] args){
	Solution s=new Solution();
	int[] a=s.constructRectangle(91);
	for(int i:a)
	  System.out.println(i);
}
}
