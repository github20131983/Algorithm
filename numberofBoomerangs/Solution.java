package numberofBoomerangs;

import java.util.HashMap;
import java.util.Map;

public class Solution {
public int numberOfBoomerangs(int[][] points) {
	int result=0;
	Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
	for(int i=0;i<points.length;i++){
		for(int j=0;j<points.length;j++){
			if(i==j)continue;
		int d=getDistance(points[i],points[j]);	
		mp.put(d, mp.getOrDefault(d,0)+1);
		}
		for(int val:mp.values())
			result+=val*(val-1);
		mp.clear();
		}	
	return result;       
    }

public int getDistance(int[] x,int[] y){
	int dx=x[0]-y[0];
	int dy=x[1]-y[1];
	return dx*dx+dy*dy;
}

public static void main(String[] args){
	Solution s=new Solution();
	int[][] p={{0,0},{1,0},{-1,0},{0,1},{0,-1}};
	System.out.println(s.numberOfBoomerangs(p));
}
}
