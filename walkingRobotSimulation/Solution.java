package walkingRobotSimulation;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set=new HashSet<>();
        for(int obstacle[]:obstacles)
        	set.add(obstacle[0]+" "+obstacle[1]);
        int[][] direct={{0,1},{1,0},{0,-1},{-1,0}};
        int di=0,x=0,y=0,max=0;
        for(int command:commands){
        	if(command==-2)
        		di=(di+3)%4;
        	else if(command==-1)
        		di=(di+1)%4;
        	else 
        		while(command-->0&&!set.contains((x+direct[di][0])+" "+(y+direct[di][1]))){       			     				
						x+=direct[di][0];
						y+=direct[di][1];
						max=Math.max(max, x*x+y*y);       			
					}
        		}
        return max;
    }
	public static void main(String[] args){
		int com[]={4,-1,4,-2,4};
		int[][] obs={{2,4}};
		Solution s=new Solution();
		System.out.print(s.robotSim(com, obs));
	}
}
