package convertaNumbertoHexadecimal;

public class Solution {
public String toHex(int num) {
	if(num==0)return "0";
	char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	String result="";
	while(num!=0){
		result=map[num&15]+result;
		num>>>=4;
	}
	return result;
    }
public static void main(String[] args){
	Solution s=new Solution();
	System.out.println(s.toHex(26));
}
}
