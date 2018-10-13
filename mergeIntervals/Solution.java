package mergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Interval> merge(List<Interval> intervals) {   	
        if(intervals.size()<=1)
        	return intervals;
        intervals.sort((i1,i2)->Integer.compare(i1.start,i2.start));
        List<Interval> res=new ArrayList<>();
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;
        for(Interval interval:intervals){
        	if(interval.start<=end)
        		end=Math.max(end, interval.end);
        	else{
        		res.add(new Interval(start,end));
        		start=interval.start;
        		end=interval.end;
        	}	
        }
        res.add(new Interval(start,end));
        return res;
    }
    public static void main(String[] args){
    	List<Interval> list=new ArrayList<>();
    	List<Interval> res=new ArrayList<>();
    	Solution s=new Solution();
    	Interval[] test=new Interval[4];
    	test[0]=new Interval(1,3);
    	test[1]=new Interval(2,6);
    	test[2]=new Interval(8,10);
    	test[3]=new Interval(15,18);
    	for(int i=0;i<test.length;i++)
    		list.add(test[i]);
    	res=s.merge(list);
    	for(int i=0;i<res.size();i++)
    		System.out.print("["+s.merge(list).get(i).start+" "+s.merge(list).get(i).end+"]");
    }
}
