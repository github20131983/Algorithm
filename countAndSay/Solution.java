package countAndSay;

public class Solution {
public String countAndSay(int n) {
        String s="1";
        for(int i=0;i<n-1;i++){
        	s=count(s);
        }
        return s;
    }
public String count(String prev){
	prev=prev+"#";
	char[] prevToArray=prev.toCharArray();
	int count=1;
	StringBuilder after=new StringBuilder();
	for(int j=0;j<prevToArray.length-1;j++){
		while(prevToArray[j]==prevToArray[j+1]&&j<prevToArray.length-2){
			count++;
			j++;	
			}
		after.append(count);
		after.append(prevToArray[j]);
		count=1;
	}
	return after.toString();	
}
  public static void main(String[] args){
	  Solution s=new Solution();
	  System.out.println(s.countAndSay(5));
  }
}
