package triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public int minimumTotal(List<List<Integer>> triangle) {
		for(int i=triangle.size()-2;i>=0;i--)
			for(int j=0;j<=i;j++)
				triangle.get(i).set(j,triangle.get(i).get(j)+
						Math.min(triangle.get(i+1).get(j),
								triangle.get(i+1).get(j+1)));
		return triangle.get(0).get(0);     
    }
	public static void main(String[] args){
		Solution s=new Solution();
		List<List<Integer>> list=new ArrayList<>();
		Integer[][] a=new Integer[4][];
		a[0]=new Integer[]{2};
		a[1]=new Integer[]{3,4};
		a[2]=new Integer[]{6,5,7};
		a[3]=new Integer[]{4,1,8,3};
		for(int i=0;i<a.length;i++)
			list.add(Arrays.asList(a[i]));
		System.out.print(s.minimumTotal(list));
	}
}
