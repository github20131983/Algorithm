package searchInsertPosition;

public class Solution {
public int romanToInt(String s) {
        int araNu=0;
        for(int i=s.length()-1;i>=0;i--){
        	char single=s.charAt(i);
        	switch(single){
        	case 'I':
        		araNu+=araNu>=5?-1:1;break;
        	case 'V':
        		araNu+=5;break;
        	case 'X':
        		araNu+=araNu>=50?-10:10;break;
        	case 'L':
        		araNu+=50;break;
        	case 'C':
        		araNu+=araNu>=500?-100:100;break;
        	case 'D':
        		araNu+=500;break;
        	case 'M':
        		araNu+=1000;break;    
		}
	}
	return araNu;
    }
  public static void main(String[] args){
	 Solution s=new Solution();
	 System.out.println(s.romanToInt("XCVIII"));
  }
}
