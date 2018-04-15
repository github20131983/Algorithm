package stringtoInteger;

public class Solution {
	public int myAtoi(String str) {
        int res=0,i=0,sig=1,overbound;
        while(i < str.length()&&str.charAt(i)==' ')i++;
        if (i < str.length()&&(str.charAt(i) == '-' || str.charAt(i) == '+'))
            sig = str.charAt(i++) == '-' ? -1 : 1;
        overbound=sig==-1?overbound=Integer.MAX_VALUE%10+1:Integer.MAX_VALUE%10;
        while (i < str.length()&&str.charAt(i) >= '0' && str.charAt(i)<= '9') {
        	if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&str.charAt(i)-'0'>overbound)){
        		if(sig==1)return Integer.MAX_VALUE;
        		else return Integer.MIN_VALUE;
        	}
        	res=res*10+(str.charAt(i++)-'0');
        }
        return sig*res;
    }
	
	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(s.myAtoi("2147483647"));
	}

}
