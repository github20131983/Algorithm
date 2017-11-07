package plusOne;

public class Solution {
public int[] plusOne(int[] digits) {
	    int c=1;
        for(int i=digits.length-1;i>=0;i--){
        	digits[i]+=c;
        	if(digits[i]>9){
        	digits[i]=0;c=1;
        	}
        	else 
        		break;
        	}
        if(digits[0]==0){
            int[] newdigits = new int[digits.length+1];
            newdigits[0]=1;
            return newdigits;
        }
        return digits;
    }
 
  public static void main(String[] args){
	  Solution s=new Solution();
	  int[] a={9,8,9,9,9};
	  int[] n=s.plusOne(a);
	  for(int i=0;i<n.length;i++)
	  System.out.print(n[i]);
  }
}
