package beautifulArrangement;
/*
 * 思路：遍历每个位置上的数字，看是否符合条件，数字不能重复使用，用一个
 * 	        数组标示
 */
public class Solution {
	int count=0;
	public int countArrangement(int N) {       
        trackback(N, 1, new int[N+1]);
        return count;
    }
	public void trackback(int N,int pos,int[] used){
		if(pos>N){
			count++;
			return;
		}
		for(int i=1;i<=N;i++){
			if(used[i]==0&&(i%pos==0||pos%i==0)){
				used[i]=1;
				trackback(N, pos+1, used);
				used[i]=0;
			}
		}
	}
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.print(s.countArrangement(2));
	}
}
