package findSmallestLetterGreaterThanTarget;

public class Solution {

	public char nextGreatestLetter(char[] letters, char target) {
        int i=0;
        int n=letters.length;
        while(letters[i]<=target){
        i++;
        if(i>=n)break;
        }
        return letters[i%n];
    }
	
	public static void main(String[] args) {
         Solution s=new Solution();
         char[] test={'c','f','j'};
         System.out.println(s.nextGreatestLetter(test, 'j'));
         }

}
