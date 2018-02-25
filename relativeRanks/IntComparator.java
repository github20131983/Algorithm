package relativeRanks;

import java.util.Comparator;

public class IntComparator implements Comparator<int[]>{	  
	@Override
	public int compare(int[] a, int[] b) {
		if(b[0]-a[0]>0)return 1;
		return -1;
	} 
}
