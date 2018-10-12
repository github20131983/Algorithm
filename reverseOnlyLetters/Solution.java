package reverseOnlyLetters;

public class Solution {
	public String reverseOnlyLetters(String S) {
		int begin=0,end=S.length()-1;
		char[] sArray=S.toCharArray();
		while(begin<end){
			while(begin<sArray.length&&!Character.isLetter(sArray[begin]))
				begin++;
			while(end>=0&&!Character.isLetter(sArray[end]))
				end--;
			if(begin<end){
				char temp=sArray[begin];
				sArray[begin]=sArray[end];
				sArray[end]=temp;
			}
			begin++;
			end--;
		}
		return new String(sArray);      
    }
	public static void main(String[] args){
		Solution s=new Solution();
		String str="Test1ng-Leet=code-Q!";
		System.out.print(s.reverseOnlyLetters(str));
	}
}
