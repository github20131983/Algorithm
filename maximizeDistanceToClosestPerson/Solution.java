package maximizeDistanceToClosestPerson;

public class Solution {
public int maxDistToClosest(int[] seats) {
        int maxDist=0,maxHead=0,maxTail=0;
        int i=0,j=seats.length-1;
        while(seats[i]==0){maxHead++;i++;}
        while(seats[j]==0){maxTail++;j--;}
        for(;i<=j;i++){
        	int count=0;
        	while(i<=j&&seats[i]==0){count++;i++;}
        	maxDist=Math.max((count+1)/2,maxDist);
        }
        return Math.max(Math.max(maxHead,maxTail), maxDist);
    }
public static void main(String[] args){
	Solution s=new Solution();
	int seats[]={1,0,0,0};
	System.out.println(s.maxDistToClosest(seats));
}
}
