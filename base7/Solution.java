package base7;

public class Solution {
	 public String convertToBase7(int num) {
		if(num==0)return "0";
		boolean flag=false;
		StringBuilder result=new StringBuilder();
		if(num<0){
			flag=true;
			num=-num;
		}
		while(num>0){
		     result.append(num%7);
		     num/=7;
		}
		if(flag)
		     return "-"+result.reverse().toString();
		return result.reverse().toString();
	    }
	 public static void main(String[] args){
		 Solution s=new Solution();
		 System.out.println(s.convertToBase7(-7));
	 }
}
