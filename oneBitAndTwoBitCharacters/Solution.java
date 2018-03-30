package oneBitAndTwoBitCharacters;

public class Solution {
public boolean isOneBitCharacter(int[] bits) {
	   int i=0;
       while(i<bits.length-1){
        	if(bits[i]==1)i+=2;
        	else i++;
        }
       System.out.println(i);
       return i==bits.length-1;
    }
	public static void main(String[] args) {
		Solution s=new Solution();
		int[] a={1,1,1,0};
		System.out.println(s.isOneBitCharacter(a));
	}

}
