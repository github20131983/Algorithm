package numberComplement;

public class Solution {
public int findComplement(int num) {
        boolean flag=false;
        for(int i=31;i>=0;i--){
        	if((num&(1<<i))!=0)flag=true;
        	if(flag)num^=1<<i;
        }
        return num;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.findComplement(5));
}
}
